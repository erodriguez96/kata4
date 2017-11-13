package kata4.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

public class Kata4 {
    private static List<Mail>  mailList;
    private static Histogram<String> histogram;
    
    public static void main(String[] args) throws FileNotFoundException, IOException {        
        execute();
    }
    private static void execute() throws FileNotFoundException, IOException{
        input();
        process();
        output();
    }
    private static void input() throws FileNotFoundException, IOException{
        String filename = "C:\\Users\\usuario\\Desktop\\emails.txt";
        mailList = MailListReader.read(filename);
    }
    private static void process(){
        histogram = MailHistogramBuilder.build(mailList);
    }
    private static void output(){
        HistogramDisplay histoDisplay = null;
        new HistogramDisplay(histogram).execute(); 
    }
}
