package SoftUniJavaOOP.OOP.Reflection.Excercise.BarracksWarsTheCommandsStrikeBack.core;

import SoftUniJavaOOP.OOP.Reflection.Excercise.BarracksWarsTheCommandsStrikeBack.core.commands.AddCommand;
import SoftUniJavaOOP.OOP.Reflection.Excercise.BarracksWarsTheCommandsStrikeBack.core.commands.Command;
import SoftUniJavaOOP.OOP.Reflection.Excercise.BarracksWarsTheCommandsStrikeBack.core.commands.ReportCommand;
import SoftUniJavaOOP.OOP.Reflection.Excercise.BarracksWarsTheCommandsStrikeBack.core.commands.RetireCommand;
import SoftUniJavaOOP.OOP.Reflection.Excercise.BarracksWarsTheCommandsStrikeBack.interfaces.Repository;
import SoftUniJavaOOP.OOP.Reflection.Excercise.BarracksWarsTheCommandsStrikeBack.interfaces.Runnable;
import SoftUniJavaOOP.OOP.Reflection.Excercise.BarracksWarsTheCommandsStrikeBack.interfaces.UnitFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Engine implements Runnable {

	private Repository repository;
	private UnitFactory unitFactory;
	private Map<String, Command> commands;

	public Engine(Repository repository, UnitFactory unitFactory) {
		this.repository = repository;
		this.unitFactory = unitFactory;
		this.commands = new HashMap<>();
		initializeCommands();
	}

	private void initializeCommands() {
		this.commands.put("add", new AddCommand(null, repository, unitFactory));
		this.commands.put("report", new ReportCommand(null, repository, unitFactory));
		this.commands.put("retire", new RetireCommand(null, repository, unitFactory));
	}

	@Override
	public void run() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			try {
				String input = reader.readLine();
				if (input.equals("fight")) {
					break;
				}
				String[] data = input.split("\\s+");
				String commandName = data[0];
				Command command = this.commands.get(commandName.toLowerCase());
				if (command != null) {
					command = command.getClass().getConstructor(String[].class, Repository.class, UnitFactory.class)
							.newInstance(data, repository, unitFactory);
					System.out.println(command.execute());
				} else {
					throw new RuntimeException("Invalid command!");
				}
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
			} catch (IOException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
