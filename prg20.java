public class prg20{
    public static void main(String[] args) {
        String month="january";
        String season=switch(month){
            case "november","december","january","febrary"->{
                System.out.println("greetings of the day");
                yield "winter";
            }
            case "june","july"->{
                System.out.println("greetings of the day");
                yield "summer";
            }
            default->{
                yield "invalid month";
            }
        };
        System.out.println(season);
    }
}