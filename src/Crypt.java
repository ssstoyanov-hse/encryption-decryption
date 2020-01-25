public interface Crypt {
    char[] encrypt(char[] chars, int key);

    char[] decrypt(char[] chars, int key);
}

class Unicode implements Crypt {
    @Override
    public char[] encrypt(char[] chars, int key) {
        // TODO: 25.01.2020  
        return chars;
    }

    @Override
    public char[] decrypt(char[] chars, int key) {
        // TODO: 25.01.2020  
        return chars;
    }
}

class Shift implements Crypt {
    @Override
    public char[] encrypt(char[] chars, int key) {
        // TODO: 25.01.2020  
        return chars;
    }

    @Override
    public char[] decrypt(char[] chars, int key) {
        // TODO: 25.01.2020  
        return chars;
    }
}

class DataCrypt {
    private Crypt crypt;

    public void setCrypt(Crypt crypt) {
        this.crypt = crypt;
    }

    public char[] encrypt(char[] chars, int key) {
        return this.crypt.encrypt(chars, key);
    }

    public char[] decrypt(char[] chars, int key) {
        return this.crypt.decrypt(chars, key);
    }
}