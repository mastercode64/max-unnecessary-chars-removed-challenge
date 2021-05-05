import java.util.ArrayList;
import java.util.List;

public class Challenge {

    public static int maxRemovedChars(String instructions) {

        List<String> unremovableInstructions = new ArrayList<>();
        int removedChars = 0;

        for (char instruction : instructions.toCharArray()) {

            if (unremovableInstructions.contains("D") && instruction == 'U') {
                unremovableInstructions.remove("D");
                removedChars += 2;
            } else if (unremovableInstructions.contains("U") && instruction == 'D') {
                unremovableInstructions.remove("U");
                removedChars += 2;
            } else if (unremovableInstructions.contains("L") && instruction == 'R') {
                unremovableInstructions.remove("L");
                removedChars += 2;
            } else if (unremovableInstructions.contains("R") && instruction == 'L') {
                unremovableInstructions.remove("R");
                removedChars += 2;
            } else {
                unremovableInstructions.add(String.valueOf(instruction));
            }
        }
        return removedChars;
    }
}
