package structural.flyWeight;

class RealCharacter extends AbstractCharacter {
    public RealCharacter(char pSymbol, int pPointSize) {
        symbol = pSymbol;
        width = 100;
        height = 90;
        ascent = 40;
        descent = 0;
        pointSize = pPointSize;
    }

    @Override
    public void Show() {
        System.out.printf("Symbol is: %c Size: %d\n", symbol, pointSize);
    }
}
