package br.com.alura.literalura.util;

import br.com.alura.literalura.service.UserInteractionService;

public class Main {

    public void runApplication() {
        UserInteractionService user = new UserInteractionService();
        user.optionMenu();
    }

}
