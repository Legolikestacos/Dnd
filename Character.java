
/**
 * class Character - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public class Character extends DnD
{
    private String name;
    private String clas;
    private int level;
    private String race;
    private int str = 10;
    private int dex = 10;
    private int con = 10;
    private int intel = 10;
    private int wis = 10;
    private int cha = 10;
    
    
    
    public Character(String n, String c, int lvl, String r)
    {
        name = n;
        clas = c;
        level = lvl;
        race = r;
        switch(race){
            case "Aarakocra":           dex+=2;
                                        wis+=1;
                                        break;
                                        
            case "Fallen Aasimar":      str+=1;
                                        cha+=2;
                                        break;
                                        
            case "Protector Aasimar":   wis+=1;
                                        cha+=2;
                                        break;
                                        
            case "Scourge Aasimar":     con+=1;
                                        cha+=2;
                                        break;
                                        
            case "Hill Dwarf":          con+=2;
                                        wis+=1;
                                        break;
            
            case "Mountain Dwarf":      con+=2;
                                        str+=2;
                                        break;
                                    
            case "Dragonborn":          str+=2;
                                        cha+=1;
                                        break;
                                    
            case "Drow Elf":            dex+=2;
                                        cha+=1;
                                        break;
                                        
            case "High Elf":            dex+=2;
                                        intel+=1;
                                        break;
                                        
            case "Wood Elf":            dex+=2;
                                        wis+=1;
                                        break;
            
            case "Firbolg":             str+=1;
                                        wis+=2;
                                        break;
            
            case "Air Genasi":          dex+=1;
                                        con+=2;
                                        break;
            
            case "Earth Genasi":        str+=1;
                                        con+=2;
                                        break;
            
            case "Fire Genasi":         con+=2;
                                        intel+=1;
                                        break;
            
            case "Water Genasi":        con+=2;
                                        wis+=1;
                                        break;
            
            case "Deep Gnome":          dex+=1;
                                        intel+=2;
                                        break;
            
            case "Forest Gnome":        dex+=1;
                                        intel+=2;
                                        break;
            
            case "Rock Gnome":          con+=1;
                                        intel+=2;
                                        break;
            
            case "Goliath":             str+=2;
                                        con+=1;
                                        break;
            
            case "Lightfoot Halfing":   dex+=2;
                                        cha+=1;
                                        break;
            
            case "Stout Halfling":      dex+=2;
                                        con+=1;
                                        break;
            
            case "Half Elf":            cha+=2;
                                        break;
            
            case "Half Orc":            str+=2;
                                        con+=1;
                                        break;
            
            case "Human":               str+=1;
                                        dex+=1;
                                        con+=1;
                                        intel+=1;
                                        wis+=1;
                                        cha+=1;
                                        break;
            
            case "Kenku":               dex+=2;
                                        wis+=1;
                                        break;
            
            case "Tabaxi":              dex+=2;
                                        cha+=1;
                                        break;
            
            case "Tiefling":            intel+=1;
                                        cha+=2;
                                        break;
        }
            
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String getClas()
    {
        return this.clas;
    }
    
    public int getLevel()
    {
        return this.level;
    }
    
    public String getRace()
    {
        return this.race;
    }
    
    public void stats()
    {
        System.out.println("Str: " + this.str);
        System.out.println("Dex: " + this.dex);
        System.out.println("Con: " + this.con);
        System.out.println("Int: " + this.intel);
        System.out.println("Wis: " + this.wis);
        System.out.println("Cha: " + this.cha);
    }
    
    public void changeStat(String stat, int num)
    {
        if(stat.toLowerCase().equals("strength"))
        {
            this.str+=num;
        }else if(stat.toLowerCase().equals("dexterity"))
        {
            this.dex+=num;
        }else if(stat.toLowerCase().equals("constitution"))
        {
            this.con+=num;
        }else if(stat.toLowerCase().equals("intelligence"))
        {
            this.intel+=num;
        }else if(stat.toLowerCase().equals("wisdom"))  
        {
            this.wis+=num;
        }else if(stat.toLowerCase().equals("charisma"))
        {
            this.cha+=num;
        }
        
    }
    
    public String toString()
    {
        return this.name + " is a level " + this.level + " " + this.race + " " + this.clas ;
    }
    
    
}
