public class Main {
    public static void main(String[] args) throws InterruptedException {
        Website website = new Website();
        System.out.println("Searching for website");
        website.start();
//        website.sleep(5000);
//        website.interrupt();

        website.join();

        if(!website.isInterrupted()){
            System.out.println("Website loaded successfully");
        }

    }
}
