# Втора лабораториска вежба по Софтверско Инженерство

## Марија Вукадиновска, бр. на индекс 203193

### Control Flow Graph

![slika_od_graph]{cfg.png}

### Цикломатска комплексност

#### Цикломатската комплексност на овој код е 10, истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли кои ги содржи графот G. Во случајoв P=9, па цикломатската комплексност изнесува 10.

### Тест случаи според Every branch критериумот:

#### Имам 22 врски помеѓу јазлите и потребни ми се овие Test cases за да ги изминам сите:

- Test case 1:  Item test = new Item("", "203193", 100, 0);
                items.add(test);
                checkCart(items, 200);  
 
- Test case 2:  Item test = new Item("Marija", "203193", 100, 0);
                items.add(test);
                checkCart(items, 200); 
      
- Test case 3:  Item test = new Item("Marija", "203193Marija", 100, 0);
                items.add(test);
                checkCart(items, 200); 

- Test case 4:  Item test = new Item("Marija", "203193", 100, 0.5)
                items.add(test);
                checkCart(items, 200); 

- Test case 5:  Item test = new Item("Marija", "0203193", 100, 0.5);
                items.add(test);
                checkCart(items, 200);
 
- Test case 6:  Item test = new Item("Marija", "203193", 100, 0);
                items.add(test);
                checkCart(items, 200).   
     
- Test case 7:  Item test = new Item("Marija", "203193", 200, 0)
                items.add(test);
                checkCart(items, 100); 

- Test case 8:  checkCart(null, 200);

#### Со овие Test cases ги посетувам двата исходи од сите јазли за одлука, односно ги опфаќам сите врски помеѓу: AB,AC,CP,CD,DE,DF,EF,FM,FG,GH,HG,GJ,HI,JL,JK,LN,KN,NO,OC,NC,PR,PQ.


### Тест случаи според Multiple Condition критериумот:

#### Во дадениот услов if има 3 подуслови, па според тоа има 2^3 = 8 различни комбинации на T и F. 
Сепак, само 4 од тие комбинации се остварливи патеки, поради тоа што за останатите 4 не постои test case кој би ја имал таа комбинација од T и F за одлуките во програмата. Тоа е воочливо бидејќи подусловите се поврзани со && ('И').  

#### Услов: if (item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0').   X значи не се извршува.

- Test case 1(XТТТ):  Item test = new Item("", "012345", 400, 0.5);

- Test case 2(XTFX):  Item test = new Item("", "13579", 400, 0);   
           
- Test case 3(XTTF):  Item test = new Item("", "12321",  500, 0.3);   
            
- Test case 4(XFFF):  Item test = new Item("", "54321", 100, 0);


### Тест примерите што ги имам напишано се од 4-тото прашање претворени во вистински код.
                 



