public class Main {
    public static void main(String[] args) {
        KitchenWorker kitchenWorker = new KitchenWorker(
                "Mary",
                "Bones",
                "female",
                true,
                "Cooker",
                5000,
                4,
                "Kitchen",
                "deserts",
                true
        );
        OfficeWorker officeWorker = new OfficeWorker(
                "Sam",
                "Rales",
                "male",
                true,
                "Programmer",
                12000,
                5,
                "IT-department",
                "Auto It Script",
                4
        );
        GuardWorker guardWorker = new GuardWorker(
                "John",
                "Cena",
                "male",
                true,
                "GUARD",
                10000,
                3,
                "Fighting with bad guys",
                "Night",
                true
        );
        kitchenWorker.work();
        officeWorker.work();
        guardWorker.work();
    }
}