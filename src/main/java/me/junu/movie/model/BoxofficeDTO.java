package me.junu.movie.model;

/**
 * packageName    : me.junu.movie.model
 * fileName       : BoxofficeDTO
 * author         : JUNU
 * date           : 2024-05-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-05-08        JUNU       최초 생성
 */
public class BoxofficeDTO {
    private String boxofficeType;       // 박스오피스 종류를 출력합니다.
    private String showRange;           // 박스오피스 조회 일자를 출력합니다.
    private String yearWeekTime;        // 조회일자에 해당하는 연도와 주차를 출력합니다.(YYYYIW)
    private String rnum;                // 순번을 출력합니다.
    private String rank;                // 해당일자의 박스오피스 순위를 출력합니다.
    private String rankInten;           // 전일대비 순위의 증감분을 출력합니다.
    private String rankOldAndNew;       // 랭킹에 신규진입여부를 출력합니다.“OLD” : 기존 , “NEW” : 신규
    private String movieCd;             // 영화의 대표코드를 출력합니다.
    private String movieNm;             // 영화명(국문)을 출력합니다.
    private String openDt;              // 영화의 개봉일을 출력합니다.
    private String salesAmt;            // 해당일의 매출액을 출력합니다.
    private String salesShare;          // 해당일자 상영작의 매출총액 대비 해당 영화의 매출비율을 출력합니다.
    private String salesInten;          // 전일 대비 매출액 증감분을 출력합니다.
    private String salesChange;         // 전일 대비 매출액 증감 비율을 출력합니다.
    private String salesAcc;            // 누적매출액을 출력합니다.
    private String audiCnt;             // 해당일의 관객수를 출력합니다.
    private String audiInten;           // 전일 대비 관객수 증감분을 출력합니다.
    private String audiChange;          // 전일 대비 관객수 증감 비율을 출력합니다.
    private String audiAcc;             // 누적관객수를 출력합니다.
    private String scrnCnt;             // 해당일자에 상영한 스크린수를 출력합니다.
    private String showCnt;             // 해당일자에 상영된 횟수를 출력합니다.

    public String getBoxofficeType() {
        return boxofficeType;
    }

    public void setBoxofficeType(String boxofficeType) {
        this.boxofficeType = boxofficeType;
    }

    public String getShowRange() {
        return showRange;
    }

    public void setShowRange(String showRange) {
        this.showRange = showRange;
    }

    public String getYearWeekTime() {
        return yearWeekTime;
    }

    public void setYearWeekTime(String yearWeekTime) {
        this.yearWeekTime = yearWeekTime;
    }

    public String getRnum() {
        return rnum;
    }

    public void setRnum(String rnum) {
        this.rnum = rnum;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getRankInten() {
        return rankInten;
    }

    public void setRankInten(String rankInten) {
        this.rankInten = rankInten;
    }

    public String getRankOldAndNew() {
        return rankOldAndNew;
    }

    public void setRankOldAndNew(String rankOldAndNew) {
        this.rankOldAndNew = rankOldAndNew;
    }

    public String getMovieCd() {
        return movieCd;
    }

    public void setMovieCd(String movieCd) {
        this.movieCd = movieCd;
    }

    public String getMovieNm() {
        return movieNm;
    }

    public void setMovieNm(String movieNm) {
        this.movieNm = movieNm;
    }

    public String getOpenDt() {
        return openDt;
    }

    public void setOpenDt(String openDt) {
        this.openDt = openDt;
    }

    public String getSalesAmt() {
        return salesAmt;
    }

    public void setSalesAmt(String salesAmt) {
        this.salesAmt = salesAmt;
    }

    public String getSalesShare() {
        return salesShare;
    }

    public void setSalesShare(String salesShare) {
        this.salesShare = salesShare;
    }

    public String getSalesInten() {
        return salesInten;
    }

    public void setSalesInten(String salesInten) {
        this.salesInten = salesInten;
    }

    public String getSalesChange() {
        return salesChange;
    }

    public void setSalesChange(String salesChange) {
        this.salesChange = salesChange;
    }

    public String getSalesAcc() {
        return salesAcc;
    }

    public void setSalesAcc(String salesAcc) {
        this.salesAcc = salesAcc;
    }

    public String getAudiCnt() {
        return audiCnt;
    }

    public void setAudiCnt(String audiCnt) {
        this.audiCnt = audiCnt;
    }

    public String getAudiInten() {
        return audiInten;
    }

    public void setAudiInten(String audiInten) {
        this.audiInten = audiInten;
    }

    public String getAudiChange() {
        return audiChange;
    }

    public void setAudiChange(String audiChange) {
        this.audiChange = audiChange;
    }

    public String getAudiAcc() {
        return audiAcc;
    }

    public void setAudiAcc(String audiAcc) {
        this.audiAcc = audiAcc;
    }

    public String getScrnCnt() {
        return scrnCnt;
    }

    public void setScrnCnt(String scrnCnt) {
        this.scrnCnt = scrnCnt;
    }

    public String getShowCnt() {
        return showCnt;
    }

    public void setShowCnt(String showCnt) {
        this.showCnt = showCnt;
    }

    @Override
    public String toString() {
        return "BoxofficeDTO{" +
                "boxofficeType='" + boxofficeType + '\'' +
                ", showRange='" + showRange + '\'' +
                ", yearWeekTime='" + yearWeekTime + '\'' +
                ", rnum='" + rnum + '\'' +
                ", rank='" + rank + '\'' +
                ", rankInten='" + rankInten + '\'' +
                ", rankOldAndNew='" + rankOldAndNew + '\'' +
                ", movieCd='" + movieCd + '\'' +
                ", movieNm='" + movieNm + '\'' +
                ", openDt='" + openDt + '\'' +
                ", salesAmt='" + salesAmt + '\'' +
                ", salesShare='" + salesShare + '\'' +
                ", salesInten='" + salesInten + '\'' +
                ", salesChange='" + salesChange + '\'' +
                ", salesAcc='" + salesAcc + '\'' +
                ", audiCnt='" + audiCnt + '\'' +
                ", audiInten='" + audiInten + '\'' +
                ", audiChange='" + audiChange + '\'' +
                ", audiAcc='" + audiAcc + '\'' +
                ", scrnCnt='" + scrnCnt + '\'' +
                ", showCnt='" + showCnt + '\'' +
                '}';
    }
}
