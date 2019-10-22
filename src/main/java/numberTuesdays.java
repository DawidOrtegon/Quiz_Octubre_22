import java.time.LocalDate;

public class numberTuesdays
{
    // Class to return the numer of tuesdays.

    public static void main(String[] args)
    {
        int year = 2019;
        cantidadMartes(year);
    }

    public static void cantidadMartes(int year)
    {
        LocalDate fechaInfo = LocalDate.of(year,1,1);
        int dayInWeek = fechaInfo.getDayOfWeek().getValue();
        int dayInMonth = fechaInfo.getMonth().maxLength();

        int contadorTuesdays = 6;

        for(int contadorDias = 1; contadorDias < dayInMonth; contadorDias ++)
        {
            if (dayInWeek == 2)
            {
                contadorTuesdays ++;
            }
        }
        System.out.println("The tuesday in the month are:  " +contadorTuesdays);
    }
}
