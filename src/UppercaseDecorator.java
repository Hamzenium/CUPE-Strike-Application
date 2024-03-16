

class UppercaseDecorator implements NewsDecorator {
    @Override
    public String performOperation(News news) {
        String content = news.getMessage();
        content = content.toUpperCase();
        return content;
    }
}
