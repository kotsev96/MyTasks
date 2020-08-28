import java.io.*;


public class CopyFile {
    public static void main(String[] args) {
        {
            int i;
            FileInputStream fin = null;
            FileOutputStream fout = null;

            // Прежде всего необходимо убедиться в том, что программе передаются имена обоих файлов
            if(args.length !=2) {
                System.out.println("Использование: CopyFile откуда куда");
                return;
            }
            // Копирование файла
            try{
                //Попытка открытия файлов
                fin = new FileInputStream(args[0]);
                fout = new FileOutputStream(args[1]);

                do{
                    i = fin.read();
                    if(i != -1) fout.write(i);
                } while(i != -1);
            } catch(IOException exc) {
                System.out.println("Ошибка ввода-вывода: " + exc);
            } finally {
                try {
                    if(fin != null) fin.close();
                } catch (IOException exc) {
                    System.out.println("Ошибка при закрытии входного файла");
                }
            } try {
                if(fout != null) fout.close();
        } catch(IOException exc){
            System.out.println("Ошибка при закрытии выходного файла");
            }
        }
    }
}
