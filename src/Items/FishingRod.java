package Items;

import java.util.Objects;

public class FishingRod implements IFishingRod {
    private final FishingLine fishingLine;

    public FishingRod() {
        this.fishingLine = new FishingLine();
    }

    public void prepare() {
        this.fishingLine.startFishing();
    }

    public void remove() {
        this.fishingLine.stopFishing();
    }

    private static class FishingLine {
        private FishingLineState state;

        public enum FishingLineState {
            STRETCHED(": Туго натянутая леса провисла"), NORMAL("<NORMAL>");

            public final String description;

            private FishingLineState(String description) {
                this.description = description;
            }
        }

        public FishingLine() {
            this.state = FishingLineState.NORMAL;
        }

        public void startFishing() {
            this.state = FishingLineState.STRETCHED;
            System.out.print(this.state.description);
        }

        public void stopFishing() {
            this.state = FishingLineState.NORMAL;
        }

        @Override
        public String toString() {
            return "FishingLine{" + "state=" + state + '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            FishingLine that = (FishingLine) o;
            return state == that.state;
        }

        @Override
        public int hashCode() {
            return Objects.hash(state);
        }
    }

    @Override
    public String toString() {
        return "FishingRod{" + "fishingLine=" + fishingLine + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FishingRod that = (FishingRod) o;
        return Objects.equals(fishingLine, that.fishingLine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fishingLine);
    }
}
