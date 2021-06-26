package homework_solution.lesson6.task4;


public class IdentityDocument {
    private String code;
    private String title;
    private String seriesAndNumber;

    private IdentityDocument(String code, String title, String seriesAndNumber) {
        this.code = code;
        this.title = title;
        this.seriesAndNumber = seriesAndNumber;
    }

    public static IdentityDocument random() {
        IdentityDocumentType docType = new IdentityDocumentType();
        return new IdentityDocument(docType.getCode(), docType.getTitle(), new StringGenerator().generate());
    }

    public String getID() {
        return code + ' ' + title + ' ' + seriesAndNumber;
    }

    public String getIDCode() {
        return code;
    }
}
