/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testhashtable;
import java.util.Scanner;
/**
 *
 *  *
 * @author Miss.Tanaporn Roschuen 5907101007 and Mr.Pornpana Khamduang 5907401003
  */
public class HashTable {
    // number of 2indexes in hash table
    private final static int TABLE_SIZE = 10000;
    // initialise array of HashEntry (table)
    HashEntry[] table;
    /*public int count=0;
    public String [] countfind = new String [TABLE_SIZE];*/
    // constructor, create array, assign all values to null
    HashTable() {
        // create array of HashEntry, predefined size
        table = new HashEntry[TABLE_SIZE];
        // assign all values to null
        for (int i = 0; i < TABLE_SIZE; i++) {
            table[i] = null;
        }
    }

    // from key, find the correct index, load the HashEntry object and return the value
    public String getValue(String key) {
        int index = this.getKeyIndex(key);
        if(table[index]==null)
        	return  key +" does not exist";
        else{
        while(table[index].equals(key)==true){
        	        index++;
       }
        HashEntry chosen_entry = table[index];
        String chosen_entry_value = chosen_entry.getValue(key);
        return chosen_entry_value;
        }
    }

    // creates a new HashEntry object, inserts that into the table array at the correct index
    // determined by getKeyIndex(key)
    public void insert(String key, String value) {
    	key=key.toLowerCase();
        int index = this.getKeyIndex(key);
        while(table[index]!=null){
        index++;
        }
        HashEntry keyValuePair;
        keyValuePair = new HashEntry(key, value);
        table[index] = keyValuePair;
        /* countfind[count]=key;
        count++;*/
    }

    // ** PRIVATE FUNCTIONS ** //
    // get index from key
    private Integer getKeyIndex(String key) {
    	key=key.toLowerCase();
        int hash = 7;
        
        for (int i = 0; i < key.length(); i++) {
            hash = (hash*31 + key.charAt(i))%5000;
        }
        return hash;
    }
    public boolean checkKey(String key){
    	key=key.toLowerCase();
    	int index = this.getKeyIndex(key);
    	return table[index]==null;
    }
    public void getEdit(String key,String value){
    	key=key.toLowerCase();
    	if(checkKey(key)==true)
    		 System.out.println("your key '"+key+"' does not exist");
    	else{
    		int index = this.getKeyIndex(key);
    		  HashEntry keyValuePair;
    		  keyValuePair = new HashEntry(key, value);
    		  table[index] = keyValuePair;
    		  System.out.println("Edit ok");
    	}
    }
    public void dleKey(String key){
    	 int index = this.getKeyIndex(key);
    	 HashEntry keyValuePair;
    	 keyValuePair = new HashEntry(null, key +" does not exist");
    	 table[index] = keyValuePair;
    	 System.out.println("this key "+key+" have Delete");
    }
    
    public void displaymanu2(String key){
        Scanner sc = new Scanner(System.in);
            System.out.println("============ menu Secarch ============");
            System.out.println("|          1. next word              |");
            System.out.println("|          2. Previous word          |");
            System.out.println("|          3. menu Add               |");
            System.out.println("======================================");
            System.out.print("input to choice :: ");
            int ch2 = sc.nextInt();
            switch(ch2)
            {
                case 1 :key = findlisd(key,0);
                        System.out.println("Next word is '"+key+"'");
                        displaymanu2(key);                      
                break;
                case 2 :key = findlisd(key,1);
                        System.out.println("Previous word is '"+key+"'");
                        displaymanu2(key);                       
                break;
                case 3 :displaymanu1(); 
                break;
                default :System.out.print("Can't choice");
            }
    }
    public void displaymanu1(){
        Scanner sc = new Scanner(System.in);
                    System.out.println("============= menu =============");
                    System.out.println("|          1. add word         |");
                    System.out.println("|          2. Search word      |");
                    System.out.println("|          3. Delete word      |");
                    System.out.println("|          4. Edit word        |");
                    System.out.println("|          5. close            |");
                    System.out.println("================================");
                    System.out.print("input to choice :: ");
                    int ch1 = sc.nextInt();
                    switch(ch1){
                        case 1 :System.out.print("input to add word :: ");
                                String word = sc.next();
                                System.out.print("input to add mean :: ");
                                String mean = sc.next();
                                insert(word, mean);
                                displaymanu1();   
                                break;
                        case 2 :System.out.print("input to word Search :: ");
                                String search = sc.next() ;
                                System.out.println("search from key mean :: "+ getValue(search) );
                                displaymanu2(search); 
                                break;
                        case 3 :System.out.print("input to  key word1 delelte :: ");
                                String dele = sc.next() ;
                                dleKey(dele);
                                displaymanu2(dele);
                                break;
                        case 4 : 
                                System.out.print("input to key word :: ");
                                String eword = sc.next() ;
                                System.out.print("edit mean :: ");
                                    String eread = sc.next() ;
                                getEdit(eword,eread);
                                displaymanu1(); 
                                break;           
                        case 5 :System.out.print("the end ");    
                        break;
                        default :if((ch1 < 1)||(ch1 >=6)){
                                 System.out.println("Can't choice");
                                 displaymanu1();
                                 }
                        }
    }
       public void displaymanu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("============menu============");
        System.out.println("|  1. load word dictionary |");
        System.out.println("============================");
        System.out.print("input to choice :: ");
        
        int ch = sc.nextInt();
        switch(ch){
            case 1 :insert("Ability","ความสามรถ"); //a
                    insert("Accident","อุบัติเหตุ");
                    insert("Adventure","การผจญภัย");
                    insert("Antenna","สายอากาศ");
                    
                    insert("Beggar","คนขอทาน"); //b
                    insert("Blanket","ผ้าห่ม");
                    insert("Bookcase","ตู้หนังสือ");
                    insert("Brush","ทำความสะอาด");
                    
                    insert("Calculator","เครื่องคิดเลข");//c
                    insert("Ceiling","เพดาน");
                    insert("Cheerful","ร่าเริง");
                    insert("Crop","ตัด");
                    
                    insert("Defense","การป้องกันตัว");//d
                    insert("Diligent","ขยัน");
                    insert("Dread","หวาดกลัว");
                    insert("Dustbin","ถังขยะ");
                    
                    insert("Editor","บรรณาธิการ");//e
                    insert("Engineer","วิศวกร");
                    insert("Exit","การออก");
                    insert("Explorer","นักสำรวจ");
                    
                    insert("Falsify","ปลอมแปลง");//f
                    insert("Forgive","ให้อภัย");
                    insert("Forward","ก้าวหน้า");
                    insert("Funeral","งานศพ");
                    
                    insert("Garment","เสื้อผ้า");//g
                    insert("Gain","ทรัพย์");
                    insert("Genius","อัจฉริยะ");
                    insert("Govern","ปกครอง");
                    
                    insert("Hack","ขวาน"); 
                    insert("Hermit","ฤๅษี");//h
                    insert("Horrible","น่ากลัว");
                    insert("Hunter","นายพราน");
                    
                    insert("Idiom","สำนวน");//i
                    insert("Impolite","หยาบคาย");
                    insert("Intend","ตั้งใจ");
                    insert("Invest","ตกแต่ง");
                    
                    insert("Jasmine","ต้นมะลิ");//j
                    insert("Journey","การเดินทาง");
                    insert("Jump","กระโดด");
                    insert("Justice","ความยุติธรรม");
                    
                    insert("karma","กรรม");
                    insert("Keeper","ผู้เก็บรักษา");//k
                    insert("Kingdom","อาณาจักร");
                    insert("Knowledge","ความรู้");
                    
                    insert("Layoff","การเลิกจ้าง");//l
                    insert("Legend","ตำนาน");
                    insert("License","ใบอนุญาติ");
                    insert("Lush","ดื่มสุรา");
                    
                    insert("Manniac","คนบ้า");//m
                    insert("Meeting","การประชุม");
                    insert("Miracle","อัศจรรย์");
                    insert("Mute","คนใบ้");
                    
                    insert("Narration","การบรรยาย");//n
                    insert("Network","เครือข่าย");
                    insert("Notice","แจ้งความ");
                    insert("Nutrition","โภชนาการ");
                    
                    insert("Obedient","เชื่อฟัง");//o
                    insert("Ocean","มหาสมุทร");
                    insert("Opportunity","โอกาส");
                    insert("Overweening","หยิ่งยโส");
                   
                    insert("Parliament","รัฐสภา");//p
                    insert("Permission","การยินยอม");
                    insert("Pleasure","ความพอใจ");
                    insert("Pound","ต่อย");
                    
                    insert("Quandary","ความอึดอัดใจ");//q
                    insert("Quarrel","ทะเลาะ");
                    insert("Queer","ประหลาด");
                    insert("Quizzical","ล้อเลียน");
                    
                    insert("Rank","ตั้งแถว");
                    insert("Register","ลงทะเบียน");//r
                    insert("Rocket","จรวด");
                    insert("Ruthless","โหดเหี้ยม");
                         
                    insert("Satellite","ดาวเทียม"); //s
                    insert("Scientist","นักวิทยาศาสตร์");
                    insert("Skeleton","โครงกระดูก");
                    insert("Smack","ตบ,ตี");
                    
                    insert("Talkative","พูดมาก");//t
                    insert("Timetable","ตารางเวลา");
                    insert("Tournament","การแข่งขัน");
                    insert("Turbidity","ยุ่งเหยิง");
                    
                    insert("Uncomfortable","ไม่สะดวก");//u
                    insert("Unholiness","ชั่วร้าย");
                    insert("Upset","สับสน");
                    insert("Useless","ไร้ประโยชน์");
                    
                    insert("Vacillate","เปลี่ยนแปลง");//v
                    insert("Ventilate","ระบายลม");
                    insert("Voyage","การเดินทางไกล");
                    insert("Vowel","สระ");
                    
                    insert("Warehouse","คลังสินค้า");//w
                    insert("Welfare","สวัสดิการ");
                    insert("Wicked","โหดร้าย");
                    insert("Wound","บาดแผล");
                    
                    insert("X ray","รังสีเอ็กซ์");//x
                    insert("Xerox","ถ่ายเอกสาร");
                    insert("Xmas","คริสต์มาส");
                    insert("xyster","เครื่องมือผ่าตัด");
                    
                    insert("Yacht","เรือท่องเที่ยว");//y
                    insert("Yeoman","ทหารรักษาพระองค์");
                    insert("Yield","ผลิต");
                    insert("Yourself","ตัวเอง");
                    
                    insert("Zap","ว้าว");                    
                    insert("Zealously","กระตือรือร้น"); //z
                    insert("Zenith","สุดยอด");
                    insert("Zoology","สัตววิทยา");
                    
                    System.out.println("load file complete");            
                    displaymanu1();
                    break;
                    
             
            default :if(ch != 1){
                System.out.println("Can't choice");
                displaymanu();
            }
       }
       }
    public String findlisd(String key,int list){
        key.toLowerCase();
        int index = getKeyIndex(key);
        if(list==0){
            index++;
             while(table[index]==null){
        index++;
        }
        }
        else{ index--;
                 while(table[index]==null){
        index--;
        }
        }
            return  table[index].getKey() ;
    }
 
        
     
}
