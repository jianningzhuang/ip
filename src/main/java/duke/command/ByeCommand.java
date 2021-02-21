package duke.command;

import duke.storage.Storage;
import duke.task.TaskList;
import duke.ui.Ui;

public class ByeCommand extends Command{

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        ui.bidGoodbye();
        storage.saveFile(tasks.getTasks());
    }

    @Override
    public boolean isExit() {
        return true;
    }
}
