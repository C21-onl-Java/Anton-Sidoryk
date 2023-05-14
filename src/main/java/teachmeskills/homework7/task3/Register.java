package teachmeskills.homework7.task3;

public class Register{

    private int count;
    private Document[] documents;

    public Register() {
        documents = new Document[10];
        count = 0;
    }

    public void addDocument(Document doc) {
        if (count < documents.length) {
            documents[count] = doc;
            count++;
        } 
    }
}
