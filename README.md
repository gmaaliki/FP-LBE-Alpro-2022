# Ghifari Maaliiki Syafa Syuhada / 5025211158
## Inheritance
Hierarki `class` pada kode saya diantara lain :
  - `Telephone` (superclass)
    - `MobilePhone`
      - `Android`
      - `Apple`

Berikut adalah bentuknya dalam kode :
```java
abstract public class Telephone {
    private String contactNumber;
    String ID, ownerName;
    
    
    public void setContactNumber(String inp) {
        this.contactNumber = inp;
    }
    
    public void getContactNumber() {
        System.out.println("Nomor " + ownerName + " : " + contactNumber);
    }    
    
    public void call() {
        System.out.println(ownerName + " diblokir mantan :(");
    }
    
    public void isCalled() {
        System.out.println("The phone doesn't make a sound");
    }
    
}
 /***
public class MobilePhone extends Telephone 
 /***
public class Android extends MobilePhone
 /***
public class Apple extends MobilePhone
```

## Encapsulation
Implementasi encapsulation dengan menggunakan access modifier sepeti private dalam beberapa variabel
```java
...
    private String contactNumber;
    String ID, ownerName;
...
```

```java
...
    private boolean isSilent = false;
...
```

## Polymorphism
Saya menurunkan kelas `Telephone` menjadi beberapa subclass. Subclass tersebut menggunakan beberapa perintah override
```java
...
    @Override
    public void isCalled() {
        System.out.println("\"Insert android call noise\"");
    }
...
```
## Abstraction
Superclass `Telephone` menggunakan modifier abstract agar `Telephone` hanya dapat diakses dengan cara menurunkan.



