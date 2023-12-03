import java.util.*;

public class HeroRecruitment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, List<String>> heroes = new LinkedHashMap<>();

        while (true) {
            String[] commands = scanner.nextLine().split(" ");

            String command = commands[0];
            if (command.equals("End")) break;

            String currentHero = commands[1];


            switch (command) {
                case "Enroll":
                    if (heroes.containsKey(currentHero)) {
                        System.out.printf("%s is already enrolled.\n", currentHero);
                    } else {
                        heroes.put(currentHero, new ArrayList<>());
                    }
                    break;
                case "Learn":
                    String spellName = commands[2];
                    if (heroes.containsKey(currentHero)) {
                        boolean isHave = checkIsHaveSpell(heroes, spellName, currentHero);
                        if (isHave) {
                            System.out.printf("%s has already learnt %s.\n"
                                    , currentHero, spellName);
                        } else {
                            heroes.get(currentHero).add(spellName);
                        }
                    } else {
                        System.out.printf("%s doesn't exist.\n", currentHero);
                    }
                    break;
                case "Unlearn":
                    spellName = commands[2];
                    if (heroes.containsKey(currentHero)) {
                        boolean isHave = checkIsHaveSpell(heroes, spellName, currentHero);
                        if (isHave) {
                            heroes.get(currentHero).remove(spellName);
                        } else {
                            System.out.printf("%s doesn't know %s.\n"
                                    , currentHero, spellName);
                        }
                    } else {
                        System.out.printf("%s doesn't exist.\n", currentHero);
                    }
                    break;
            }
        }
        System.out.println("Heroes:");

        for (Map.Entry<String, List<String>> kvp : heroes.entrySet()) {
            System.out.printf("== %s: %s\n",
                    kvp.getKey(),
                    String.join(", ", kvp.getValue()));
        }

    }

    private static boolean checkIsHaveSpell(LinkedHashMap<String, List<String>> heroes, String spellName, String currentHero) {
        List<String> heroSpells = heroes.get(currentHero);

        for (String spell : heroSpells) {
            if (spell.equals(spellName)) {
                return true;
            }
        }
        return false;
    }
}
