package model;

public abstract class Card {
    private String name;
    private CardTypeEnum cardType;
    private CardBaseInfo cardBaseInfo;
    private int lscale;
    private int rscale;

    public Card(String name, CardTypeEnum cardType, CardBaseInfo cardBaseInfo, int lscale, int rscale) {
        this.name = name;
        this.cardType = cardType;
        this.cardBaseInfo = cardBaseInfo;
        this.lscale = lscale;
        this.rscale = rscale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CardTypeEnum getCardType() {
        return cardType;
    }

    public void setCardType(CardTypeEnum cardType) {
        this.cardType = cardType;
    }

    public CardBaseInfo getCardBaseInfo() {
        return cardBaseInfo;
    }

    public void setCardBaseInfo(CardBaseInfo cardBaseInfo) {
        this.cardBaseInfo = cardBaseInfo;
    }

    public int getLscale() {
        return lscale;
    }

    public void setLscale(int lscale) {
        this.lscale = lscale;
    }

    public int getRscale() {
        return rscale;
    }

    public void setRscale(int rscale) {
        this.rscale = rscale;
    }

    class CardBaseInfo {
        private ImgInfo cardImg;
        private String expansionCode;
        private String collectorCardNumber;

        public CardBaseInfo(ImgInfo cardImg, String expansionCode, String collectorCardNumber) {
            this.cardImg = cardImg;
            this.expansionCode = expansionCode;
            this.collectorCardNumber = collectorCardNumber;
        }

        public ImgInfo getCardImg() {
            return cardImg;
        }

        public void setCardImg(ImgInfo cardImg) {
            this.cardImg = cardImg;
        }

        public String getExpansionCode() {
            return expansionCode;
        }

        public void setExpansionCode(String expansionCode) {
            this.expansionCode = expansionCode;
        }

        public String getCollectorCardNumber() {
            return collectorCardNumber;
        }

        public void setCollectorCardNumber(String collectorCardNumber) {
            this.collectorCardNumber = collectorCardNumber;
        }
    }

    class ImgInfo{
        private String url;

        public ImgInfo(String url) {
            this.url = url;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
