public class App {
    public static void main(String[] args) throws Exception{
        Read_and_input readF = new Read_and_input();
        // readF.inputReader();
        Write_and_pow ts = new Write_and_pow();

        ts.computing(readF.inputReader("a"),readF.inputReader("b"));
    }
}
