package homework_solution.lesson6.task2;

enum PhoneType {
    HOME("Домашний"),
    WORK("Рабочий"),
    MOBILE("Мобильный");

    private String description;

    PhoneType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}
