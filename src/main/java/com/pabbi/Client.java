package com.pabbi;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Client {
    public static void main(String[] args) {
        PrintStream out =  new PrintStream(new FileOutputStream(FileDescriptor.out));
        Construction standardConstruction = new Construction("standard", 1200);
        Construction aboveStandardConstruction = new Construction("aboveStandard", 1200);
        Construction highStandardConstruction = new Construction("highStandard", 1200);
        Construction highAutomatedConstruction = new Construction("highStandard", 1200, true);
        out.println("The construction cost with standard materials with full automation is: " + standardConstruction.getConstructionCost());
        out.println("The construction cost with above standard materials is: " + aboveStandardConstruction.getConstructionCost());
        out.println("The construction cost with high standard materials is: " + highStandardConstruction.getConstructionCost());
        out.println("The construction cost with high standard materials with full automation is: " + aboveStandardConstruction.getConstructionCost());
    }
}
