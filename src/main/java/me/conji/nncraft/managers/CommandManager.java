package me.conji.nncraft.managers;

import me.conji.nncraft.api.NNCommand;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class CommandManager implements Iterable<NNCommand> {
    private List<NNCommand> commands;

    public CommandManager() {
        this.commands = new ArrayList<NNCommand>();
    }

    @NotNull
    public Iterator<NNCommand> iterator() {
        return this.commands.iterator();
    }

    public void registerCommand(NNCommand command) {
        this.commands.add(command);
    }
}
