public class ScannerDemo {

    public static void main(String[] args) {
        String fileName = args.length > 0 ? args[0] : "prog1.jay";
        TokenStream ts = new TokenStream(fileName);
        int counter = 1;

        while (true) {
            Token tk = ts.nextToken();

            if (ts.isEndofFile() && tk.getValue().isEmpty()) {
                break;
            }

            System.out.println("Token " + counter++
                + " - Type: " + tk.getType()
                + " - Value: " + tk.getValue());
        }
    }
}
