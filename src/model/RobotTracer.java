package model;

import java.io.*;

public class RobotTracer {
    File file = new File("/home/user/Enigma/Batch14/java_OOP/challenge_robot/src/resource/Tracer.txt");
    BufferedReader br = new BufferedReader(new FileReader(file));
    BufferedWriter bw = new BufferedWriter(new FileWriter(file,true));
    private String lastLine = "";
    private String currenLine = "";

    public RobotTracer() throws IOException {

    }

    public void writeTracer(String direction, int x, int y) throws IOException {
        bw.write("\n"+direction+","+x+","+y);
    }

    public void readTracer() throws IOException{
        try {
            while ((this.currenLine = br.readLine()) != null){
                this.lastLine = currenLine;
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void cleanUp() throws IOException{
        bw.close();
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public BufferedReader getBr() {
        return br;
    }

    public void setBr(BufferedReader br) {
        this.br = br;
    }

    public BufferedWriter getBw() {
        return bw;
    }

    public void setBw(BufferedWriter bw) {
        this.bw = bw;
    }

    public String getLastLine() {
        return lastLine;
    }

    public void setLastLine(String lastLine) {
        this.lastLine = lastLine;
    }

    public String getCurrenLine() {
        return currenLine;
    }

    public void setCurrenLine(String currenLine) {
        this.currenLine = currenLine;
    }
}
