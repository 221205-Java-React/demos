package com.revature;

import com.revature.models.Player;

import java.util.ArrayList;

public class Launcher {

    public static void main(String[] args) {

        /* This is the beginning of a harrowing Java adventure -
        -Create a Player Class by implementing the IPlayer Interface.
        -Instantiate your Player here, ONLY giving it a name
        -Print out "[player name] was born!" */

        Player player = new Player("Ponyo");
        System.out.println(player.getName() + " was born");

        /* Despite you just being born, you're surrounded by wolves!! Where are your parents?

          -fight() them off!!!
                _
               / \      _-'
             _/|  \-''- _ /
        __-' { |          \
            /             \
            /       "o.  |o }
            |            \ ;
                          ',
               \_         __\
                 ''-_    \.//
                   / '-____'
                  /
                _'
              _-' */

        player.fight();

    /*You barely survive, losing 90 health in the fight
     -Subtract 90 from player health, and print out remaining health*/

    player.setHealth(player.getHealth() - 90);
    System.out.println(player.getHealth());



    /* Welcome to the Aspirin merchant! Fighting wolves always leaves me with a headache...

    "You may take some Aspirin by solving my riddle nyahahahaha"

    "Make me an int that is not quite an int, but its OBJECT representation.
     use it to assign your health to 200 - such is the Aspirin incantation"
         _____
        [IIIII]
         )"""(
        /     \
       /       \
       |`-...-'|
       | asprin|
     _ |`-...-'j    _
    (\)`-.___.(I) _(/)
      (I)  (/)(I)(\) */

    Integer health = 200;
    player.setHealth(health);
    System.out.println(player.getHealth());


        /* Welcome to the blacksmith! It's time for some upgrades.
        -Craft and assign yourself a weapon and armor using the craft() method⠀⠀⠀⠀
        -Check out your new gear by printing it
        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⣷⡄⠀⠀⠀⠀⠀⠀⠀⢠⣄⣤⣦⣤⣀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠛⠿⠟⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⣠⠀⠘⢿⣿⠟⠀⢠⡀⠀⠀⠀⠀⠀⠀⠀⣰⡗⠀⠀⠀⠀
⠀⠀⠀⠀⠀⢠⣾⠀⣿⠀⣷⣦⣤⣴⡇⢸⡇⠀⣷⠀⠀⠀⠀⣰⡟⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⣿⣿⠀⣿⣤⣈⣉⣉⣉⣠⣼⡇⠀⣿⡆⠀⠀⣰⡟⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⣿⣿⠀⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⣿⠇⠀⠀⠛⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠛⠛⠀⠛⠛⠛⠛⠛⠛⠛⠛⠃⠀⠛⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⣤⣤⣤⣤⣤⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠈⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣤⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠈⠙⠛⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠋⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠿⠿⠿⣿⣿⣿⣿⣿⣿⣿⠿⠿⠿⠇⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⣿⣿⣿⣿⣿⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⡀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠘⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠃⠀⠀⠀⠀⠀  */

        player.setWeapon(player.craft("Sword", "Iron"));
        player.setArmor(player.craft("Breastplate", "Steel Plate"));

        System.out.println(player.getWeapon());
        System.out.println(player.getArmor());



    /*You encounter an angry Wizard! He looks like he's got unhandled problems.

    "I pity you traveler, for you will be the new bearer of my burden... TRY to handle THIS!!!"

         __/\__
    . _   \''/
    -( )-/_||_\
     .'. \_()_/
      |   | . \
      |   | .  \
     .'. ,\_____'. */

   try{
       int x = 2/0;
   } catch(ArithmeticException e) {
       System.out.println("Caught ArithmeticException!!");
   } finally{
       player.fight();
   }

    /* "WOW!! My curse has been lifted. I wish you didn't hit me back though.
    Anyway, I will reward you if you can solve my riddle -

    "Make me a sequence of 1, 2, and 3 - ordered and indexed this data structure must be.
    Print the second element of this creation - or else you shall suffer eternal damnation."
         __/\__
    . _   \^^/
    -( )-/_||_\
     .'. \_()_/
      |   | . \
      |   | .  \
     .'. ,\_____'. */

    int[] sequence = {1,2,3};
    System.out.println(sequence[1]);


    /*After solving the wizard's riddle, he vanishes in a puff of bytecode!!
      A chest lays at your feet! :O
         _-_______-
        /\____;;___\
       | /         /
       `. ())oo() .
        |\(%()*^^()^\
       %| |-%-------|
      % \ | %  ))   |
      %  \|%________|

      -Iterate through the chest's loot
      -Choose (print out) only the favorable items
      -Skip the unfavorable items*/

      String[] items = {"Monster Energy", "Two dollars", "Two doll hairs", "Puppy",
      "The Declaration of Independence", "Staff of Plot Thickening"};

      for(int i = 0; i < items.length; i++){

          if (items[i].equals("Two doll hairs"))
              continue;
          System.out.println(items[i]);
      }

      /*"The Staff of Plot Thickening? Better use this since I'm out of ideas for smooth transitions"

      Upon using the Staff, an imp appears!!

        "Myahhh! I am an Imp named Slickback"

        "Your name is Slickback?" You query.

        "NO! My name is an Imp named Slickback. And because that upset me for some reason,
        you must now answer my riddle lest I gnaw on your ankles!!"
              ,      ,
        |\   /(.-""-.)\ /|
        | \ / =.  .= \ / |
        \( \   o\/o   / )/
         \_, '-/  \-' ,_/
           /   \__/   \
           \ \__/\__/ /
            \ \|--|/ /

        "What can we use, to let users choose, datatypes during instantiation?
        it's used in collections, and it's my perception that it lends to code flexibility"

       */

        //thanks to the <Generic> declared in the ArrayList Class,
        //we developers are able to instantiate an ArrayList of any object we want.
        ArrayList<String> stuff = new ArrayList<>();


        /*Despite your correct answer, the imp betrayed you!! You're fighting!!!

              O                                     O
        {o)xxx|===============-  *  -===============|xxx(o}
              O                                     O

        -Uhhhh let's go with turn based combat.
        -While imp health is > 0, invoke fight() and subtract 20 from both fighter's health
        -After the fight, print out your own health */

        int impHealth = 100;

        while(impHealth > 0){
            player.fight();
            impHealth -= 20;
            player.setHealth(player.getHealth() - 20);
        }

        System.out.println(player.getHealth());


        /*You're hurt, but the surgeon general recommends no more than 12 tablets of Aspirin
        per 24 hours. Better wander into the nearest tavern for a drink instead.

                            ________[_]________
                   /\      /\        ______    \
                  /  \    //_\       \    /\    \
           /\    / /\/\  //___\       \__/  \    \
          /  \  /\/    \//_____\       \ |[]|     \
         /\/\/\/       //_______\       \|__|      \
        /      \      /XXXXXXXXXX\                  \
                \    /_I_II  I__I_\__________________\
                       I_I|  I__I_____[]_|_[]_____I
                       I_II  I__I_____[]_|_[]_____I
                       I II__I  I     XXXXXXX     I

        "How many riddles does a guy have to answer to get some mead?" You ask

        "Just one, as usual!" Replies the innkeeper

        "This non access mod makes beginners sob, for its use case is somewhat unclear...
        It makes a variable belong to the class, and its value between objects adheres" */

        Player p2 = new Player("Jojo");

        System.out.println(p2.getHealth()); //100
        player.setHealth(90);
        System.out.println(player.getHealth()); //90
        System.out.println(p2.getHealth()); //90

        //Since the health variable is static, it's shared amongst every player.
        //Probably not what we want. if you want values to be unique between objects, you want nonstatic.


        /* That wasn't so hard was it?

                  )  (o
                ( o  ) )
                 ) ( (o
                ooooooooo
             .-'---ooooo-|
            ( C|/\/\/oo\/|
             '-./\/\/\/\/|
               '_________'
                '-------'

            Except all this happy juice is making you ROWDY. Time for a good old fashioned bar brawl.

            "HOW MANY OF YOU MILK DRINKERS WANNA CATCH SOME HANDS?" You inquire politely...

            There were 10.
            */
        /*

        (ง'̀-'́)ง (ง'̀-'́)ง (ง'̀-'́)ง (ง'̀-'́)ง (ง'̀-'́)ง (ง'̀-'́)ง (ง'̀-'́)ง (ง'̀-'́)ง (ง'̀-'́)ง (ง'̀-'́)ง

        You're getting absolutely stomped out by 10 tavern patrons! You've accepted your fate.

        -Everyone is getting a hit in!
        -For every patron, subtract 15 from your health.
        -If your health is less than or equal to 0 after any hit, you die and the loop breaks! */

        for(int i = 0; i <= 10; i++){

            player.setHealth(player.getHealth() - 15);

            if(player.getHealth() <= 0){
                System.out.println("A very mature baby started a bar fight thus sealing his fate");
                System.out.println("~///THE END///~");
                break;
            }

        }

    }

}
