package homework_solution.lesson6.task4;


public class IdentityDocument {
    private String code;
    private String title;
    private String seriesAndNumber;

    public IdentityDocument random() {
        IdentityDocumentType docType = new IdentityDocumentType();
        this.code = docType.getCode();
        this.seriesAndNumber = new StringGenerator().generate(docType);
        this.title = docType.getTitle();
        return this;
    }

    public String getID() {
        return code + ' ' + title + ' ' + seriesAndNumber;
    }

    public String getIDCode() {
        return code;
    }
}
