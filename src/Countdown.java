import java.time.Duration;
import java.time.LocalTime;

import static java.lang.Thread.sleep;

public class Countdown {
    public static void main(String[] args) throws InterruptedException {
        String[] nil = {
                "  .-```````-.  ",
                " / ,```````. \\ ",
                " |/ .-./ )  \\| ",
                " || \\ '_ .')|| ",
                " ||(_ (_) _)|| ",
                " ||  / .  \\ || ",
                " ||  `-'`\"` || ",
                " \\'._______.'/ ",
                "  '._______.'  "};
        String[] one = {
                "     ,---.     ",
                "    /_   |     ",
                "      ,_ |     ",
                "  ,-./  )|     ",
                "  \\  '_ '`)    ",
                "   > (_)  )    ",
                "  (  .  .-'    ",
                "   `-'`-'|     ",
                "     '---'     "};
        String[] two = {
                "    .`````-.   ",
                "   /   ,-.  \\  ",
                "  (___/  |   | ",
                "        .'  /  ",
                "    _.-'_.-'   ",
                "  _/_  .'      ",
                " ( ' )(__..--. ",
                "(_{;}_)      | ",
                " (_,_)-------' "};
        String[] three = {
                "    .-'''-.    ",
                "   /   _   \\   ",
                "  |__/` '.  |  ",
                "     .--'  /   ",
                "  ___'--._ _\\  ",
                " |   |  ( ` )  ",
                " |   `-(_{;}_) ",
                "  \\     (_,_)  ",
                "   `-..__.-'   "};
        String[] four = {
                "       ,---.   ",
                "      /,--.|   ",
                "     //_  ||   ",
                "    /_( )_||   ",
                "   /(_ o _)|   ",
                "  / /(_,_)||_  ",
                " /  `-----' || ",
                " `-------|||-' ",
                "         '-'   "};
        String[] five = {
                " ,--------.    ",
                " |   _____|    ",
                " |  )          ",
                " |  '----.     ",
                " |_.._ _  '.   ",
                "    ( ' )   \\  ",
                "  _(_{;}_)  |  ",
                " |  (_,_)  /   ",
                "  `...__..'    "};
        String[] six = {
                "   .------.    ",
                "  /  .-.   \\   ",
                " /  /   `--'   ",
                " |  .----.     ",
                " |   _ _  '.   ",
                " |  ( ' )   \\  ",
                " | (_{;}_)  |  ",
                " \\  (_,_)  /   ",
                "  `...__..'    "};
        String[] seven = {
                " ,----------.  ",
                " '..-------,(  ",
                "     _ _   //  ",
                "    (_I_) //   ",
                "   (_(=)_)/    ",
                "    (_I_)/     ",
                "     ,-'/      ",
                "    )  (       ",
                "    `---'      "};
        String[] eight = {
                "   .-''''-.    ",
                "  /  _--.  \\   ",
                "  |_( )_ ' |   ",
                "  (_ o _). /   ",
                " .'(_,_).  `.  ",
                "|_( )_    \\  | ",
                "(_ o _)   /  | ",
                " (_,_)..-' .'  ",
                "   `-....-'    "};
        String[] nine = {
                "   .-````-.    ",
                "  /  _ _   \\   ",
                " |  ( ' )  |   ",
                " | (_{;}_) |   ",
                " |  (_,_)  |   ",
                "  \\        |   ",
                "   `----`  |   ",
                "   .--. /  /   ",
                "   )_____.'    "};
        String[] colon =
                {"  _ _   ",
                        " ( ` )  ",
                        "(_{;}_) ",
                        " (_,_)  ",
                        "   _    ",
                        " _( )_  ",
                        "(_ o _) ",
                        " (_,_)  ",
                        "        "};
        LocalTime end = LocalTime.of(17, 00);
        while (true) {
            LocalTime now = LocalTime.now();
            if (now.equals(end)) {
                System.out.println("Time to go home");
                break;
            }
            Duration dur = Duration.between(now, end);
            long secs = dur.toSeconds();
            long min = secs / 60;
            secs = secs - (min * 60);
            long h = min / 60;
            min = min - (h * 60);
            String[] countdown = new String[9];
            for (int i = 0; i < 9; i++) {
                countdown[i] = "";
            }
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 8; j++) {
                    if (j == 0) {
                        switch ((int) h / 10) {
                            case 0:
                                countdown[i] += nil[i];
                                break;
                            case 1:
                                countdown[i] += one[i];
                                break;
                            case 2:
                                countdown[i] += two[i];
                                break;
                            case 3:
                                countdown[i] += three[i];
                                break;
                            case 4:
                                countdown[i] += four[i];
                                break;
                            case 5:
                                countdown[i] += five[i];
                                break;
                            case 6:
                                countdown[i] += six[i];
                                break;
                            case 7:
                                countdown[i] += seven[i];
                                break;
                            case 8:
                                countdown[i] += eight[i];
                                break;
                            case 9:
                                countdown[i] += nine[i];
                                break;
                        }
                    } else if (j == 1) {
                        switch ((int) h % 10) {
                            case 0:
                                countdown[i] += nil[i];
                                break;
                            case 1:
                                countdown[i] += one[i];
                                break;
                            case 2:
                                countdown[i] += two[i];
                                break;
                            case 3:
                                countdown[i] += three[i];
                                break;
                            case 4:
                                countdown[i] += four[i];
                                break;
                            case 5:
                                countdown[i] += five[i];
                                break;
                            case 6:
                                countdown[i] += six[i];
                                break;
                            case 7:
                                countdown[i] += seven[i];
                                break;
                            case 8:
                                countdown[i] += eight[i];
                                break;
                            case 9:
                                countdown[i] += nine[i];
                                break;
                        }
                    } else if (j == 2) {
                        countdown[i] += colon[i];
                    } else if (j == 3) {
                        switch ((int) min / 10) {
                            case 0:
                                countdown[i] += nil[i];
                                break;
                            case 1:
                                countdown[i] += one[i];
                                break;
                            case 2:
                                countdown[i] += two[i];
                                break;
                            case 3:
                                countdown[i] += three[i];
                                break;
                            case 4:
                                countdown[i] += four[i];
                                break;
                            case 5:
                                countdown[i] += five[i];
                                break;
                            case 6:
                                countdown[i] += six[i];
                                break;
                            case 7:
                                countdown[i] += seven[i];
                                break;
                            case 8:
                                countdown[i] += eight[i];
                                break;
                            case 9:
                                countdown[i] += nine[i];
                                break;
                        }
                    } else if (j == 4) {
                        switch ((int) min % 10) {
                            case 0:
                                countdown[i] += nil[i];
                                break;
                            case 1:
                                countdown[i] += one[i];
                                break;
                            case 2:
                                countdown[i] += two[i];
                                break;
                            case 3:
                                countdown[i] += three[i];
                                break;
                            case 4:
                                countdown[i] += four[i];
                                break;
                            case 5:
                                countdown[i] += five[i];
                                break;
                            case 6:
                                countdown[i] += six[i];
                                break;
                            case 7:
                                countdown[i] += seven[i];
                                break;
                            case 8:
                                countdown[i] += eight[i];
                                break;
                            case 9:
                                countdown[i] += nine[i];
                                break;
                        }
                    } else if (j == 5) {
                        countdown[i] += colon[i];
                    } else if (j == 6) {
                        switch ((int) secs / 10) {
                            case 0:
                                countdown[i] += nil[i];
                                break;
                            case 1:
                                countdown[i] += one[i];
                                break;
                            case 2:
                                countdown[i] += two[i];
                                break;
                            case 3:
                                countdown[i] += three[i];
                                break;
                            case 4:
                                countdown[i] += four[i];
                                break;
                            case 5:
                                countdown[i] += five[i];
                                break;
                            case 6:
                                countdown[i] += six[i];
                                break;
                            case 7:
                                countdown[i] += seven[i];
                                break;
                            case 8:
                                countdown[i] += eight[i];
                                break;
                            case 9:
                                countdown[i] += nine[i];
                                break;
                        }
                    } else {
                        switch ((int) secs % 10) {
                            case 0:
                                countdown[i] += nil[i];
                                break;
                            case 1:
                                countdown[i] += one[i];
                                break;
                            case 2:
                                countdown[i] += two[i];
                                break;
                            case 3:
                                countdown[i] += three[i];
                                break;
                            case 4:
                                countdown[i] += four[i];
                                break;
                            case 5:
                                countdown[i] += five[i];
                                break;
                            case 6:
                                countdown[i] += six[i];
                                break;
                            case 7:
                                countdown[i] += seven[i];
                                break;
                            case 8:
                                countdown[i] += eight[i];
                                break;
                            case 9:
                                countdown[i] += nine[i];
                                break;
                        }
                    }
                }
            }
            for (String s : countdown) {
                System.out.println(s);
            }
            sleep(1000);
            System.out.println("\n");
        }
    }
}

