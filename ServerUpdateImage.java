import ServerJava.server.PrintMananger;

public class ServerUpdateImage extends Thread{
    public static byte img_bytes[] = new byte[1];

    public void run(){
        try{
            while(true) {
                //System.out.println("rodando");
                if (PrintMananger.images.isEmpty()) {
                    Thread.sleep(10);
                    continue;
                }
                img_bytes = PrintMananger.images.remove();
                Thread.sleep(33);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
