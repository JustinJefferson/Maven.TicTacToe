package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character[][] ticTacToe;

    public Board(Character[][] matrix) {

        ticTacToe = matrix;
    }

    public Boolean isInFavorOfX() {

        Character player = 'X';
        Boolean favor = false;
        Integer count = 0;

        //Check row one

        for(int i = 0; i < ticTacToe.length; i++) {
            if(ticTacToe[0][i].equals(player)) count++;
            if(count == 3) favor = true;
        }
        count = 0;

        //Check row two
        if(!favor) {
            for (int i = 0; i < ticTacToe.length; i++) {
                if (ticTacToe[1][i].equals(player)) count++;
                if (count == 3) favor = true;
            }
            count = 0;
        }


        //Check row three
        if(!favor) {
            for (int i = 0; i < ticTacToe.length; i++) {
                if (ticTacToe[2][i].equals(player)) count++;
                if (count == 3) favor = true;
            }
            count = 0;
        }


        //Check column one
        if(!favor) {
            for (int i = 0; i < ticTacToe.length; i++) {
                if (ticTacToe[i][0].equals(player)) count++;
                if (count == 3) favor = true;
            }
            count = 0;
        }

        //Check column rwo
        if(!favor) {
            for (int i = 0; i < ticTacToe.length; i++) {
                if (ticTacToe[i][1].equals(player)) count++;
                if (count == 3) favor = true;
            }
            count = 0;
        }

        //Check column three
        if(!favor) {
            for (int i = 0; i < ticTacToe.length; i++) {
                if (ticTacToe[i][2].equals(player)) count++;
                if (count == 3) favor = true;
            }
            count = 0;
        }

        int i = 0;

        //Check left diagnol
        if(!favor) {
            while(i < ticTacToe.length) {
                if (ticTacToe[i][i].equals(player)) count++;
                if (count == 3) favor = true;
                i++;
            }
            count = 0;
        }

        i = 0;
        int j = 2;
        //Check right diagnol
        if(!favor) {
            while(i < ticTacToe.length) {
                if (ticTacToe[i][j].equals(player)) count++;
                if (count == 3) favor = true;
                i++;
                j--;
            }
        }

        return favor;
    }

    public Boolean isInFavorOfO() {

        Character player = 'O';
        Boolean favor = false;
        Integer count = 0;

        //Check row one

        for(int i = 0; i < ticTacToe.length; i++) {
            if(ticTacToe[0][i].equals(player)) count++;
            if(count == 3) favor = true;
        }
        count = 0;

        //Check row two
        if(!favor) {
            for (int i = 0; i < ticTacToe.length; i++) {
                if (ticTacToe[1][i].equals(player)) count++;
                if (count == 3) favor = true;
            }
            count = 0;
        }


        //Check row three
        if(!favor) {
            for (int i = 0; i < ticTacToe.length; i++) {
                if (ticTacToe[2][i].equals(player)) count++;
                if (count == 3) favor = true;
            }
            count = 0;
        }


        //Check column one
        if(!favor) {
            for (int i = 0; i < ticTacToe.length; i++) {
                if (ticTacToe[i][0].equals(player)) count++;
                if (count == 3) favor = true;
            }
            count = 0;
        }

        //Check column rwo
        if(!favor) {
            for (int i = 0; i < ticTacToe.length; i++) {
                if (ticTacToe[i][1].equals(player)) count++;
                if (count == 3) favor = true;
            }
            count = 0;
        }

        //Check column three
        if(!favor) {
            for (int i = 0; i < ticTacToe.length; i++) {
                if (ticTacToe[i][2].equals(player)) count++;
                if (count == 3) favor = true;
            }
            count = 0;
        }

        int i = 0;

        //Check left diagnol
        if(!favor) {
            while(i < ticTacToe.length) {
                if (ticTacToe[i][i].equals(player)) count++;
                if (count == 3) favor = true;
                i++;
            }
            count = 0;
        }

        i = 0;
        int j = 2;
        //Check right diagnol
        if(!favor) {
            while(i < ticTacToe.length) {
                if (ticTacToe[i][j].equals(player)) count++;
                if (count == 3) favor = true;
                i++;
                j--;
            }
        }

        return favor;
    }

    public Boolean isTie() {

        Character player = 'X';
        Boolean favorX = false;
        Integer count = 0;

        //Check row one

        for(int i = 0; i < ticTacToe.length; i++) {
            if(ticTacToe[0][i].equals(player)) count++;
            if(count == 3) favorX = true;
        }
        count = 0;

        //Check row two
        if(!favorX) {
            for (int i = 0; i < ticTacToe.length; i++) {
                if (ticTacToe[1][i].equals(player)) count++;
                if (count == 3) favorX = true;
            }
            count = 0;
        }


        //Check row three
        if(!favorX) {
            for (int i = 0; i < ticTacToe.length; i++) {
                if (ticTacToe[2][i].equals(player)) count++;
                if (count == 3) favorX = true;
            }
            count = 0;
        }


        //Check column one
        if(!favorX) {
            for (int i = 0; i < ticTacToe.length; i++) {
                if (ticTacToe[i][0].equals(player)) count++;
                if (count == 3) favorX = true;
            }
            count = 0;
        }

        //Check column rwo
        if(!favorX) {
            for (int i = 0; i < ticTacToe.length; i++) {
                if (ticTacToe[i][1].equals(player)) count++;
                if (count == 3) favorX = true;
            }
            count = 0;
        }

        //Check column three
        if(!favorX) {
            for (int i = 0; i < ticTacToe.length; i++) {
                if (ticTacToe[i][2].equals(player)) count++;
                if (count == 3) favorX = true;
            }
            count = 0;
        }



        //Check left diagnol
        if(!favorX) {
            int i = 0;
            while(i < ticTacToe.length) {
                if (ticTacToe[i][i].equals(player)) count++;
                if (count == 3) favorX = true;
                i++;
            }
            count = 0;
        }


        //Check right diagnol
        if(!favorX) {
            int i = 0;
            int j = 2;
            while(i < ticTacToe.length) {
                if (ticTacToe[i][j].equals(player)) count++;
                if (count == 3) favorX = true;
                i++;
                j--;
            }
            count = 0;
        }


        player = 'O';
        Boolean favorO = false;
        count = 0;

        //Check row one

        for(int i = 0; i < ticTacToe.length; i++) {
            if(ticTacToe[0][i].equals(player)) count++;
            if(count == 3) favorO = true;
        }
        count = 0;

        //Check row two
        if(!favorO) {
            for (int i = 0; i < ticTacToe.length; i++) {
                if (ticTacToe[1][i].equals(player)) count++;
                if (count == 3) favorO = true;
            }
            count = 0;
        }


        //Check row three
        if(!favorO) {
            for (int i = 0; i < ticTacToe.length; i++) {
                if (ticTacToe[2][i].equals(player)) count++;
                if (count == 3) favorO = true;
            }
            count = 0;
        }


        //Check column one
        if(!favorO) {
            for (int i = 0; i < ticTacToe.length; i++) {
                if (ticTacToe[i][0].equals(player)) count++;
                if (count == 3) favorO = true;
            }
            count = 0;
        }

        //Check column rwo
        if(!favorO) {
            for (int i = 0; i < ticTacToe.length; i++) {
                if (ticTacToe[i][1].equals(player)) count++;
                if (count == 3) favorO = true;
            }
            count = 0;
        }

        //Check column three
        if(!favorO) {
            for (int i = 0; i < ticTacToe.length; i++) {
                if (ticTacToe[i][2].equals(player)) count++;
                if (count == 3) favorO = true;
            }
            count = 0;
        }



        //Check left diagnol
        if(!favorO) {
            int i = 0;
            while(i < ticTacToe.length) {
                if (ticTacToe[i][i].equals(player)) count++;
                if (count == 3) favorO = true;
                i++;
            }
            count = 0;
        }


        //Check right diagnol
        if(!favorO) {
            int i = 0;
            int j = 2;
            while(i < ticTacToe.length) {
                if (ticTacToe[i][j].equals(player)) count++;
                if (count == 3) favorO = true;
                i++;
                j--;
            }
        }

        if((!favorO) && (!favorX)) {
            return true;
        }
        else {
            return false;
        }
    }

    public String getWinner() {

        Character player = 'X';
        String winner = "";
        Integer count = 0;

        //Check row one

        for(int i = 0; i < ticTacToe.length; i++) {
            if(ticTacToe[0][i].equals(player)) count++;
            if(count == 3) winner = "X";
        }
        count = 0;


        //Check row two
        if(winner.equals("")) {
            for (int i = 0; i < ticTacToe.length; i++) {
                if (ticTacToe[1][i].equals(player)) count++;
                if (count == 3) winner = "X";
            }
            count = 0;
        }


        //Check row three
        if(winner.equals("")) {
            for (int i = 0; i < ticTacToe.length; i++) {
                if (ticTacToe[2][i].equals(player)) count++;
                if (count == 3) winner = "X";
            }
            count = 0;
        }


        //Check column one
        if(winner.equals("")) {
            for (int i = 0; i < ticTacToe.length; i++) {
                if (ticTacToe[i][0].equals(player)) count++;
                if (count == 3) winner = "X";
            }
            count = 0;
        }

        //Check column rwo
        if(winner.equals("")) {
            for (int i = 0; i < ticTacToe.length; i++) {
                if (ticTacToe[i][1].equals(player)) count++;
                if (count == 3) winner = "X";
            }
            count = 0;
        }

        //Check column three
        if(winner.equals("")) {
            for (int i = 0; i < ticTacToe.length; i++) {
                if (ticTacToe[i][2].equals(player)) count++;
                if (count == 3) winner = "X";
            }
            count = 0;
        }



        //Check left diagnol
        if(winner.equals("")) {
            int i = 0;
            while(i < ticTacToe.length) {
                if (ticTacToe[i][i].equals(player)) count++;
                if (count == 3) winner = "X";
                i++;
            }
            count = 0;
        }


        //Check right diagnol
        if(winner.equals("")) {
            int i = 0;
            int j = 2;
            while(i < ticTacToe.length) {
                if (ticTacToe[i][j].equals(player)) count++;
                if (count == 3) winner = "X";
                i++;
                j--;
            }
            count = 0;
        }

        player = 'O';

        //Check row one
        if(winner.equals("")) {
            for (int i = 0; i < ticTacToe.length; i++) {
                if (ticTacToe[0][i].equals(player)) count++;
                if (count == 3) winner = "O";
            }
            count = 0;
        }

        //Check row two
        if(winner.equals("")) {
            for (int i = 0; i < ticTacToe.length; i++) {
                if (ticTacToe[1][i].equals(player)) count++;
                if (count == 3) winner = "O";
            }
            count = 0;
        }


        //Check row three
        if(winner.equals("")) {
            for (int i = 0; i < ticTacToe.length; i++) {
                if (ticTacToe[2][i].equals(player)) count++;
                if (count == 3) winner = "O";
            }
            count = 0;
        }


        //Check column one
        if(winner.equals("")) {
            for (int i = 0; i < ticTacToe.length; i++) {
                if (ticTacToe[i][0].equals(player)) count++;
                if (count == 3) winner = "O";
            }
            count = 0;
        }

        //Check column rwo
        if(winner.equals("")) {
            for (int i = 0; i < ticTacToe.length; i++) {
                if (ticTacToe[i][1].equals(player)) count++;
                if (count == 3) winner = "O";
            }
            count = 0;
        }

        //Check column three
        if(winner.equals("")) {
            for (int i = 0; i < ticTacToe.length; i++) {
                if (ticTacToe[i][2].equals(player)) count++;
                if (count == 3) winner = "O";
            }
            count = 0;
        }

        //Check left diagnol
        if(winner.equals("")) {
            int i = 0;
            while(i < ticTacToe.length) {
                if (ticTacToe[i][i].equals(player)) count++;
                if (count == 3) winner = "O";
                i++;
            }
            count = 0;
        }


        //Check right diagnol
        if(winner.equals("")) {
            int i = 0;
            int j = 2;
            while(i < ticTacToe.length) {
                if (ticTacToe[i][j].equals(player)) count++;
                if (count == 3) winner = "O";
                i++;
                j--;
            }
        }

        return winner;
    }

}
