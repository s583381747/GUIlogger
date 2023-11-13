package com.example.guilogger;

public class DefData {
    public static class Deliverable {
        private String deliverable;
        private int index;

        public Deliverable(String deliverable, int index) {
            this.deliverable = deliverable;
            this.index = index;
        }

        public String getDeliverable() {
            return deliverable;
        }

        public int getIndex() {
            return index;
        }
    }

    public static class EffortCategory {
        private String effortCategory;
        private int index;

        public EffortCategory(String effortCategory, int index) {
            this.effortCategory = effortCategory;
            this.index = index;
        }

        public String getEffortCategory() {
            return effortCategory;
        }

        public int getIndex() {
            return index;
        }
    }

    public static class Interruption {
        private int index;
        private String interruptions;

        public Interruption(int index, String interruptions) {
            this.index = index;
            this.interruptions = interruptions;
        }

        public int getIndex() {
            return index;
        }

        public String getInterruptions() {
            return interruptions;
        }
    }
        public static class LifecycleStep {
            private String deliverable;
            private String effortCategory;
            private int index;
            private String lifecycleStep;

            public LifecycleStep(String deliverable, String effortCategory, int index, String lifecycleStep) {
                this.deliverable = deliverable;
                this.effortCategory = effortCategory;
                this.index = index;
                this.lifecycleStep = lifecycleStep;
            }

            public String getDeliverable() {
                return deliverable;
            }

            public String getEffortCategory() {
                return effortCategory;
            }

            public int getIndex() {
                return index;
            }

            public String getLifecycleStep() {
                return lifecycleStep;
            }
        }


        public static class Plan {
        private int index;
        private String plans;

        public Plan(int index, String plans) {
            this.index = index;
            this.plans = plans;
        }

        public int getIndex() {
            return index;
        }

        public String getPlans() {
            return plans;
        }
    }

    public static class Project {
        private int four;
        private int index;
        private String name;
        private int one;
        private int three;
        private int two;

        public Project(int four, int index, String name, int one, int three, int two) {
            this.four = four;
            this.index = index;
            this.name = name;
            this.one = one;
            this.three = three;
            this.two = two;
        }

        public int getFour() {
            return four;
        }

        public int getIndex() {
            return index;
        }

        public String getName() {
            return name;
        }

        public int getOne() {
            return one;
        }

        public int getThree() {
            return three;
        }

        public int getTwo() {
            return two;
        }
    }

}
