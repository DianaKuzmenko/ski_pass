/**
 * Created by cs.ucu.edu.ua on 11/28/2016.
 */
public enum TypeOfDays implements SkiPass {
    WEEKDAYS, WEEKEND, Season;

    enum Weekdays implements SkiPass {
        NumberOfDays, NumberOfRaising;

        enum NumberOfDays {
            OneDay, TwoDays, FiveDays;

            public String toString() {
                switch (this) {
                    case OneDay:
                        return "one-day pass";
                    case TwoDays:
                        return "two-days pass";
                    case FiveDays:
                        return "five-days pass";
                    default:
                        return "no days - no pass - go home";

                }
            }
        }

        enum NumberOfRaising {
            ten, twenty, fifty, hundred;

            public String toString() {
                switch (this) {
                    case ten:
                        return "you have 10 raisings";
                    case twenty:
                        return "you have 20 raisings";
                    case fifty:
                        return "you have 50 raisings";
                    case hundred:
                        return "you have 100 raisings";
                    default:
                        return "no raisings";
                }
            }
        }
    }

    enum WEEKEND implements SkiPass {
        NumberOfDays, NumberOfRaising;

        enum NumberOfDays {
            OneDay, TwoDays;

            public String toString() {
                switch (this) {
                    case OneDay:
                        return "one-day pass";
                    case TwoDays:
                        return "two-days pass";
                    default:
                        return "no days - no pass - go home";

                }
            }
        }

        enum NumberOfRaising {
            ten, twenty, fifty, hundred;

            public String toString() {
                switch (this) {
                    case ten:
                        return "you have 10 raisings";
                    case twenty:
                        return "you have 20 raisings";
                    case fifty:
                        return "you have 50 raisings";
                    case hundred:
                        return "you have 100 raisings";
                    default:
                        return "no raisings";
                }
            }
        }
    }

}

//    public String toString(){
//        switch (this){
//            enum WEEKDAYS{
//                No
//            }
//                return "weekdays";
//            case WEEKEND:
//                return "weekend";
//            default:
//                return "no days"
//        }
//    }
//}
