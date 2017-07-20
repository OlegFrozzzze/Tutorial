package Tom1;

public class TaskTen {
    public static String printTextPerRole() {
        String[] roles = new String[0];
        String[] textLines = new String [0];
        StringBuilder resultText = new StringBuilder();

        for (String role : roles) {
            resultText.append(role + ":" + "\n");

            for (int i = 0; i < textLines.length; i++) {
                String[] splitLine = textLines[i].split(": ", 2);
                String roleFromText = splitLine[0];
                String roleText = splitLine[1];

                if (role.equals(roleFromText)) {
                    resultText.append((i + 1) + ") " + roleText + "\n");
                }
            }

            resultText.append("\n");
        }

        return resultText.toString();
    }
}
