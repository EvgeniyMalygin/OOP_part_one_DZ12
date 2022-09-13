public class Compare {

    public void printCompare(Gryffindor gryffindor1, Gryffindor gryffindor2) {
        int sum1 = gryffindor1.getBravery() + gryffindor1.getHonor() + gryffindor1.getNobility();
        int sum2 = gryffindor2.getBravery() + gryffindor2.getHonor() + gryffindor2.getNobility();
        if (sum1 > sum2) {
            System.out.printf("%s лучший Гриффиндорец чем %s \n", gryffindor1.getFullName(), gryffindor2.getFullName());
        } else {
            System.out.printf("%s лучший Гриффиндорец чем %s \n", gryffindor2.getFullName(), gryffindor1.getFullName());
        }
    }

    public void printCompare(Puffenduy puffenduy1, Puffenduy puffenduy2) {
        int sum1 = puffenduy1.getHonesty() + puffenduy1.getLoyalty() + puffenduy1.getHardWork();
        int sum2 = puffenduy2.getHonesty() + puffenduy2.getLoyalty() + puffenduy2.getHardWork();
        if (sum1 > sum2) {
            System.out.printf("%s лучший Пуффендуец чем %s \n", puffenduy1.getFullName(), puffenduy2.getFullName());
        } else {
            System.out.printf("%s лучший Пуффендуец чем %s \n", puffenduy2.getFullName(), puffenduy1.getFullName());
        }
    }

    public void printCompare(Kogtevran kogtevran1, Kogtevran kogtevran2) {
        int sum1 = kogtevran1.getMind() + kogtevran1.getCreativity() + kogtevran1.getWisdom() +
                kogtevran1.getWit();
        int sum2 = kogtevran2.getMind() + kogtevran2.getCreativity() + kogtevran2.getWisdom() +
                kogtevran2.getWit();
        if (sum1 > sum2) {
            System.out.printf("%s лучший Когтевранец чем %s \n", kogtevran1.getFullName(), kogtevran2.getFullName());
        } else {
            System.out.printf("%s лучший Когтевранец чем %s \n", kogtevran2.getFullName(), kogtevran1.getFullName());
        }
    }

    public void printCompare(Slytherin slytherin1, Slytherin slytherin2) {
        int sum1 = slytherin1.getDecisiveness() + slytherin1.getAmbition() + slytherin1.getCunning() +
                slytherin1.getResourcefulness() + slytherin1.getThirstForPower();
        int sum2 = slytherin2.getDecisiveness() + slytherin2.getAmbition() + slytherin2.getCunning() +
                slytherin2.getResourcefulness() + slytherin2.getThirstForPower();
        if (sum1 > sum2) {
            System.out.printf("%s лучший Слизеринец чем %s \n", slytherin1.getFullName(), slytherin2.getFullName());
        } else {
            System.out.printf("%s лучший Слизеринец чем %s \n", slytherin2.getFullName(), slytherin1.getFullName());
        }
    }


    public void printCompare(Hogwarts hogwart, Hogwarts hogwart1) {
        int sum1 = hogwart.getTransgressDistance() + hogwart.getWitchcraftPower();
        int sum2 = hogwart1.getTransgressDistance() + hogwart1.getWitchcraftPower();
        if (sum1 > sum2) {
            System.out.printf("%s сильнее в магии чем %s \n", hogwart.getFullName(), hogwart1.getFullName());
        } else {
            System.out.printf("%s сильнее в магии чем %s \n", hogwart1.getFullName(), hogwart.getFullName());
        }
    }
}
