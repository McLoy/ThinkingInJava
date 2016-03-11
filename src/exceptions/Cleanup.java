package exceptions;

/**
 * Created by Ostin on 21.11.2015.
 */
public class Cleanup {
    public static void main(String[] args) {
        try{
            InputFile in = new InputFile("Cleanup java");
            try{
                String s;
                int i = 1;
                while ((s = in.getLine()) != null)
                    ;// построчная обработка
            }catch (Exception e){
                System.out.println("Перехвачено Exception в main");
                e.printStackTrace(System.out);
            }finally {
                in.dispose();
            }
        }catch (Exception e){
            System.out.println("Сбой при конструировании InputFile");
        }
    }
}
