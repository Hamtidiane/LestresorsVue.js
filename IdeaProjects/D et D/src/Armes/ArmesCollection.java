package Armes;
    public enum ArmesCollection {
        massue("massue", 3, "armes"),
        epée("epée", 5, "armes" );


        private final String name;
        private final int strong;
        private final String type;

        ArmesCollection(String name, int strong, String type) {
            this.name = name;
            this.strong = strong;
            this.type = type;
        }

        public String getName() {
            return name;
        }
        public int getStrong() {
            return strong;
        }

        public String getType() {
            return type;
        }

        public static ArmesCollection random() {
            return values()[(int) (Math.random() * values().length)];
        }

        public String toString() {
            return " | Arme : " + name + " - Puissance : " + strong + " | Type : " + type;
        }
    }

