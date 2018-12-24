package com.example.noahs.cmeum;

        import android.os.Bundle;
        import android.content.Intent;
        import android.net.Uri;
        import android.support.design.widget.Snackbar;

        import android.support.v7.app.AppCompatActivity;
        import android.support.v7.widget.Toolbar;
        import android.view.View;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.widget.Button;
        import android.app.AlertDialog;
        import android.content.DialogInterface;

        import com.example.noahs.cmeum.R;

public class MainActivity extends AppCompatActivity {
    private static Button Memes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClickButtonListener();

        Button Logic = (Button) findViewById(R.id.button11);
        Logic.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Logic");
                alertDialog.setMessage("Two guys, Ray and Tom, sitting around the watercooler at Lowe's. Ray looks at Tom and says, \n" +
                        "\n" +
                        "Ray: Man, half the time, I don't even know what these people are asking me for. I just do my best to not look stupid.\n" +
                        "Tom: There is a real simple way to get to the bottom of things. Just use your Logic!\n" +
                        "Ray: What the hell is 'logic'?\n" +
                        "Tom: Well, I can only describe it to you like this: Ray, do you own a weedeater?\n" +
                        "Ray: Yep! A nice one!\n" +
                        "Tom: Well, then logically, I can deduce that you own a house?\n" +
                        "Ray: Right again!\n" +
                        "Tom: And by that, I can logically deduce that you are a married man!?\n" +
                        "Ray: I am indeed! Happily!\n" +
                        "Tom: And by that, I can logically deduce that you have children!?\n" +
                        "Ray: A boy and a girl.\n" +
                        "Tom: And by using all that logic, I can logically deduce that you are not a gay man!\n" +
                        "Ray: Holy shit! That is amazing. I'm gonna have to start using logic!\n" +
                        "\n" +
                        "The next day, Ray was around the water cooler again when another man, Bob, came along.\n" +
                        "\n" +
                        "Bob: Ray, I am stressed the hell out! These people are asking me questions about stuff I have never had to deal with before!\n" +
                        "Ray: Bob, there is a real simple way for you to get things figured out...are you familiar with Logic?\n" +
                        "Bob: No! What's that?\n" +
                        "Ray: It's a real simple way to draw educated conclusions.\n" +
                        "Bob: Explain it to me...\n" +
                        "Ray: Well, here is the only way I can describe it to you: Bob, do you own a weedeater?\n" +
                        "Bob: Nope! Why?\n" +
                        "Ray: Ya gay, ain't ya, Bob?");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Alz = (Button) findViewById(R.id.button2);
        Alz.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Old Couple/Alzheimer's");
                alertDialog.setMessage("An old man and an old woman went to the doctor to have a checkup together. The doctor entered the \n" +
                        "room:\n" +
                        "\n" +
                        "Doctor: I have your test results back, and it looks like both of you are in the beginning stages of \n" +
                        "Alzheimer's. My suggestion is that you start writing things down on little notepads that you need to do for " +
                        "the day, things that come to mind, etc. \n" +
                        "\n" +
                        "So, the old man and old woman go home. Later that night, the old woman asks the old man:\n" +
                        "\n" +
                        "Wife: Honey, do you want some ice cream?\n" +
                        "Husband: Yeah, sure! Just I want chocolate and vanilla.\n" +
                        "Wife: Chocolate and Vanilla ice cream...got it!\n" +
                        "Husband: Shouldn't you write that down? The doctor said we need to start taking notes.\n" +
                        "Wife: Old man, I have been getting you ice cream for 55 years. I believe I can remember what kind of ice \n" +
                        "cream you want.\n" +
                        "Husband: Ok! But I also want some whipped cream and sprinkles!\n" +
                        "Wife: Chocolate and vanilla ice cream, Sprinkles, Whipped cream...no problem!\n" +
                        "Husband: and can you also put some nuts and chocolate syrup on there?\n" +
                        "Wife: Chocolate and vanilla ice cream with nuts, chocolate syrup, whipped cream and sprinkles! See old man, " +
                        "I can still remember your ice cream order!\n" +
                        "\n" +
                        "The wife walks into the kitchen and starts getting everything ready. She passes the door with a frying pan, " +
                        "and then goes back and gets a pot. The old man hears the stove start up, hears the pans getting rearranged, " +
                        "the fridge door opening, glasses clinking together and then finally, after about 30 mins in the kitchen, the " +
                        "old woman returns with a tray that she sits down in front of the old man. The old man looks down at the " +
                        "tray. On it are orange juice, grits, butter, eggs, sausage, jelly and a glass of milk. The old man starts laughing:\n" +
                        "\n" +
                        "Husband: Woman...I swear! I knew you would forget the minute you got out of my sight!\n" +
                        "Wife: What? Old man, I didn't forget a single thing!\n" +
                        "Husband: Woman, you forgot my damned toast!\n");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Oatmeal = (Button) findViewById(R.id.button12);
        Oatmeal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Old Couple/Breakfast");
                alertDialog.setMessage("An old man and old woman in their 80's were sitting at the breakfast table:\n" +
                        "\n" +
                        "Woman: Honey, do you still find me attractive?\n" +
                        "Man: Woman, I'm trying to eat my breakfast, so stop with all the questions!\n" +
                        "Woman: But...do you still find me attractive?\n" +
                        "Man: Yes! Now, can I go back to eating my breakfast?\n" +
                        "Woman: Yes dear!\n" +
                        "\n" +
                        "A couple of minutes later, the old lady looks at the old man again:\n" +
                        "\n" +
                        "Woman: Do you still find my body desirable?\n" +
                        "Man: Damnit woman, I done told you I'm trying to eat my breakfast!\n" +
                        "Woman: Well, do you find my body desirable?\n" +
                        "Man: Yes! Now, Can I please finish eating my breakfast?\n" +
                        "Woman: Yes dear!\n" +
                        "\n" +
                        "A couple of minutes later, the old woman looks back at the old man:\n" +
                        "\n" +
                        "Woman: Honey, do you remember when we were young, we used to make love all night and then sit at the breakfast table naked eating our breakfast?\n" +
                        "Man: Yes woman, I remember. \n" +
                        "Woman: Let's get naked and eat breakfast like we did when we were young!\n" +
                        "Man: If I do that, will you leave me alone and let me eat my breakfast in peace?\n" +
                        "Woman: Yes I will!\n" +
                        "\n" +
                        "The old woman and the old man got undressed and sat at the breakfast table in the nude. After a few seconds, the old woman leans over to the old man:\n" +
                        "\n" +
                        "Woman: Honey, my nipples are still as hot for you today as they were when we were young!\n" +
                        "Man: Damnit woman, they should be...one is in your coffee and the other is swimming in your oatmeal!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Dark = (Button) findViewById(R.id.button19);
        Dark.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Dark");
                alertDialog.setMessage("A security guard had been working 7 days a week for a month when his supervisor came to him and told him that he had too many hours for the month and needed to take the rest of the day off! The man drives home. At his house, the mans wife is in the bedroom with her lover. She hears the car pull up in the driveway and she ushers her lover  into the closet. While in the closet, he hears a little voice:\n" +
                        "\n" +
                        "Boy: Sure is dark in here!\n" +
                        "Man: Damn kid, you scared the hell out of me! You're right, it is dark in here!\n" +
                        "Boy: You know, my daddy is right outside!\n" +
                        "Man: Yep, I know. Let's just keep our voices down!\n" +
                        "Boy: Hey, you wanna buy my baseball glove?\n" +
                        "Man: No thank you! I've got my own!\n" +
                        "Boy: You know, my daddy is right outside!\n" +
                        "Man: Ok kid, you got me over a barrel. How much do you want for that baseball?\n" +
                        "Boy: $500.00\n" +
                        "Man: That is robbery, there is no way I'm paying $500.00 for a used baseball!\n" +
                        "Boy: You know my daddy is right outside!\n" +
                        "Man: True! Ok, I'll buy your baseball!\n" +
                        "\n" +
                        "A month passes and the same situation unfolds. The husband has to come home early, wife is in bed with lover who she ushers into the closet. Upon entering the closet, the man hears a little voice:\n" +
                        "\n" +
                        "Boy: Sure is dark in here!\n" +
                        "Man: Oh goddamn...not you again!\n" +
                        "Boy: You know, my daddy is right outside!\n" +
                        "Man: Yes, I know. What are you selling today?\n" +
                        "Boy: My baseball glove!\n" +
                        "Man: And just how much do you want for your baseball glove?\n" +
                        "Boy: $500.00!\n" +
                        "Man: I would say no, but I know you'll just say...\n" +
                        "Boy: My daddy's right outside!\n" +
                        "Man: Right! Here's your money!\n" +
                        "\n" +
                        "Another month goes by and the husband comes home early from work. The little boy is sitting in front of the T.V. watching cartoons. \n" +
                        "\n" +
                        "Dad: Son, it's too pretty outside for you to be inside. Go get your ball and glove and we'll pass them around for a while!\n" +
                        "Son: But Daddy, I can't! I sold my ball and glove.\n" +
                        "Dad: You sold'em? For how much?\n" +
                        "Son: $1000.00 Daddy!\n" +
                        "Dad: Who in the world would pay that much for a used ball and glove? Son, we are a chrisitan family and we don't believe in taking advantage of people. Get ready and we'll head on down to the church so you can ask forgiveness for what you have done!\n" +
                        "\n" +
                        "The father and son drive down to the local church! Once inside the father points to the confessional booth and tells his son to go in and confess! The little boy goes into the confessional and the slot slides open.\n" +
                        "\n" +
                        "Boy: Sure is dark in here!\n" +
                        "Priest: Oh goddamn, not you again! Listen kid, I'm broke, Ok!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });


        Button Members = (Button) findViewById(R.id.button20);
        Members.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Members");
                alertDialog.setMessage("A young couple were trying to become members of a church, but the only way to become members of the church was to go a whole month with no sex. The preacher takes the stage and speaks with an old couple.\n" +
                        "\n" +
                        "Preacher: And how did you do this month?\n" +
                        "Old couple: We did just fine. We've been together for 40 years. A month without sex to us was nothing!\n" +
                        "Preacher: Well, congratulations, you are now members of our church!\n" +
                        "\n" +
                        "The preacher moves on to the next couple who had only been married for 5 years.\n" +
                        "\n" +
                        "Preacher: Well, tell me how did you fare this month?\n" +
                        "Couple: We did just fine. It was very complicated towards the end of the month, so we decided to sleep in different rooms, but as of today, we haven't had sex in a month!\n" +
                        "Preacher: Well, congratulations! You are now welcome members of our church!\n" +
                        "\n" +
                        "The preacher moves on to the next couple who were looking very sheepish and shy.\n" +
                        "\n" +
                        "Preacher: Now, these are our newlyweds. Tell me, Newlyweds, how did you fare for the month?\n" +
                        "Young man: Well preacher, we were doing just fine. I was sleeping on the couch so as to not entice my wife, and we were avoiding each other except at meals. However, this morning at breakfast, we both reached for a croissant, our hands met and...well, we embraced and before I knew it, I had taken my wife right there on the breakfast table!\n" +
                        "Preacher: Well, that's too bad! As you know, you are not welcome to be members of this church now!\n" +
                        "Young man: That's ok, preach! We also aren't welcome back at that restaurant anymore, either!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Bubba = (Button) findViewById(R.id.button14);
        Bubba.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Bubba");
                alertDialog.setMessage("One day a man was at a casino in Las Vegas sitting next to a Texas man with a big cowboy hat on! The man leaned over to introduce himself.\n" +
                        "\n" +
                        "Bubba: Names Bubba! Pleased to meet you!\n" +
                        "Man: My names Dave, Bubba! The pleasure is all mine!\n" +
                        "\n" +
                        "While they were at the table, the man noticed that almost every person that walked by Bubba, had something to say to him, a nice pleasantry, a hug or a kiss and Bubba seemed to know everyone by name as well!\n" +
                        "\n" +
                        "Man: You sure are a famous figure here. Seems like everyone knows ya!\n" +
                        "Bubba: Yeah! I pretty much know everyone except for you!\n" +
                        "Man: I bet I know someone who is staying in Las Vegas right now that you don't know!\n" +
                        "Bubba: Who's that?\n" +
                        "Man: Bill Clinton!\n" +
                        "Bubba: William? Oh hell, I know Will from back at Oxford! \n" +
                        "Man: Prove it and I will give you $5000.00 cash right now!\n" +
                        "Bubba: No problem!\n" +
                        "\n" +
                        "Bubba asks a waitress for a phone and when she brings it to him, he dials a number and asks for Bill Clinton! After a few seconds on the phone, he hangs up!\n" +
                        "\n" +
                        "Man: Well?\n" +
                        "Bubba: He's coming down now!\n" +
                        "Man: Right! Sure!\n" +
                        "\n" +
                        "About that time, a commotion could be seen near the elevators and sure enough, there was Bill Clinton surrounded by his body guards! He came over to Bubba and they embraced and called each other old nicknames! When Clinton had left, Bubba looks at the man with his hand out.\n" +
                        "\n" +
                        "Bubba: Told you I knew old Bill! Now, pay up!\n" +
                        "Man: Ok! I'm impressed! Double or nothing says that you don't know the next man I'm about to mention.\n" +
                        "Bubba: It's your money!\n" +
                        "Man: Staying in this hotel is Jet Li! \n" +
                        "Bubba: HAHAHA...old Li Lian Jie? Man, me and Jet used to party all night long when he first got to the states. Hell, if it weren't for my couch and kitchen, the poor boy would have been homeless and starved!\n" +
                        "Man: Well, prove it!\n" +
                        "\n" +
                        "Bubba asks the waitress for a phone again and after some talking on the phone he hangs up!\n" +
                        "\n" +
                        "Man: Well?\n" +
                        "Bubba: He said he was on his way...yep...there he is!\n" +
                        "\n" +
                        "In the distance, a crowd of people were walking towards them away from the elevators. In the back of the crowd, every few seconds, you can see an asian head bob up and down. Bubba see's Jet Li and they embrace and chat for a few minutes before Bubba comes back to the table.\n" +
                        "\n" +
                        "Man: Well, I have to say that I am supremely impressed. It sure does look like you know just about everyone!\n" +
                        "Bubba: Everyone except you!\n" +
                        "Man: Bubba, I'm a billionaire and I want to make a bet with you that you don't know the next person I am going to name. If you say you know them, then I will pay for the airfare, accommodations and expenses plus I will give you 1 million dollars. If you don't know him, all you owe me is the 10k I have already lost!\n" +
                        "\n" +
                        "Bubba: Deal! Who is the next person on your mind?\n" +
                        "Man: The Pope!\n" +
                        "Bubba: Jorge? You mean Pope Francis? Why that old sly dog! He and I used to sit and smoke cigarettes and get drunk while talking shit about religion...that is...until he became Pope!\n" +
                        "Man: So, you are saying that you know him?\n" +
                        "Bubba: Know him? He's like a father to me! I love him!\n" +
                        "Man: Prove it!\n" +
                        "\n" +
                        "After landing in Rome and getting squared away, Bubba and the man head towards the Papal apartments. Outside the Pope's office, there are thousands upon thousands of people waiting to see the Pope!\n" +
                        "\n" +
                        "Bubba: Wait here! I'm going to go up there with the Pope. When you see me, head on up to the guards and they will let you in.\n" +
                        "Man: Sure Bubba! Whatever you say!\n" +
                        "\n" +
                        "After about 10 minutes, the Pope appears and standing right behind him is Bubba! The man promptly passes out!\n" +
                        "\n" +
                        "When he revives, Bubba and the Pope are there looking down on him. \n" +
                        "\n" +
                        "Bubba: Man, I guess seeing me up there with the Pope must have taken the wind from you, huh?\n" +
                        "Man: No, it wasn't that! When I saw you up there with the Pope, some man behind me tapped me on the shoulder and said \"Hey, who's that up there with Bubba?\"!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button SMDrunk = (Button) findViewById(R.id.button18);
        SMDrunk.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Super Drunk");
                alertDialog.setMessage("A guy sitting at a bar starts to get loud when the bartender goes up to him.\n" +
                        "\n" +
                        "Guy: Hey bartender...I'm superman drunk!\n" +
                        "Bartender: Hey buddy, you can't just come up in here and claim to be superman drunk! There's a process you have to go through in order to call yourself superman drunk!\n" +
                        "Guy: Oh yeah? Well, what's that? I can do it!\n" +
                        "Bartender: Ok, well, you see that old man sitting down at the end of the bar? \n" +
                        "Guy: Yeah!\n" +
                        "Bartender: Well, you have to knock him off of his stool. He's never been knocked off of it before! Second, in the back room there, is a lioness with a broke tooth. You have to remove that tooth from the lion's mouth and finally, there is a 90 year old woman upstairs that has never had an orgasm. Make her have an orgasm, pull the tooth and knock the man from his stool and you can officiall call yourself superman drunk!\n" +
                        "\n" +
                        "Guy: No problem!\n" +
                        "\n" +
                        "The man takes off and with one quick hit knocks the man from his stool! He then heads to the back of the room and enters the door of the lion. Once inside, there is a ruckus never heard before. At first, there is growling, thrashing, fighting and then, after a few minutes, there is nothing but quiet and a mewling sound! The man walks out of the room with a torn shirt and pants, blood everywhere and says:\n" +
                        "\n" +
                        "Guy: Ok, now where did you say that old lady with a broke tooth is?");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button AirWalk = (Button) findViewById(R.id.button17);
        AirWalk.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Air Walk");
                alertDialog.setMessage("A man stays at a hotel one night that has a bar at the top floor. He heads up and can see a crowd over near the window. A man standing there is telling everyone about a new liquid that allows you to walk on air:\n" +
                        "\n" +
                        "Man: Folks, with just one drink of this elixir, I will be able to walk out onto thin air and walk all the way around the building.\n" +
                        "\n" +
                        "Everyone places their bets, the man drinks the elixir and steps out onto thin air and walks around the building. Everyone is amazed! After a couple of drinks, the man walks over to the window and starts up a conversation:\n" +
                        "\n" +
                        "Guy: Let me have a drink of that stuff! I want to walk on air like you just did!\n" +
                        "Man: I wouldn't do that, friend! You really have to be able to handle your drink in order for it to work!\n" +
                        "Guy: Just give me a drink and let me go! If you can do it, I can do it, asshole!\n" +
                        "Man: Sure! It's a thousand dollars!\n" +
                        "\n" +
                        "The man reaches into his wallet and pulls out a thousand dollars and hands it to the man! The man gives the guy the drink and the guy slams it, steps out of the window and falls quickly to his death! About this time, the bartender walks up to the man.\n" +
                        "\n" +
                        "Bartender: You know, Superman, you sure are an asshole when you get drunk!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button ButtHurt = (Button) findViewById(R.id.button16);
        ButtHurt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Wonder Woman");
                alertDialog.setMessage("Superman was flying around looking for some pussy when he came up to the window of Wonder Woman! As he peeked inside, he could see her laying in bed nude, moving around as if she were enjoying herself! Superman, not wanting to disturb her, decides to use his incredible speed to rush into the room, make love to her and be gone before she ever knows what happened. In a flash, Superman is in the room, does his deed and is gone!\n" +
                        "\n" +
                        "Wonder Woman: What the hell was that?\n" +
                        "Invisible Man: I don't know, but my asshole is killing me!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Octopus = (Button) findViewById(R.id.button15);
        Octopus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Octopus");
                alertDialog.setMessage("A man walks into a bar with an Octopus!\n" +
                        "\n" +
                        "Man: This creature can play any instrument you place before it! I will pay anyone $25.00 if they can put an instrument in front of this Octopus that it can't play. However, if you lose, you owe me $25.00! A customer at the end of the bar goes out to his car and brings in an electric guitar!\n" +
                        "\n" +
                        "Customer: Here! Let's see it play this!\n" +
                        "Man: Sure thing!\n" +
                        "\n" +
                        "The Octopus picks the guitar up and immediately lays into a riff that amazes the other customers!\n" +
                        "\n" +
                        "Man: Pay up, buddy!\n" +
                        "\n" +
                        "The man pays, but heads back to his car and brings in a keyboard!\n" +
                        "\n" +
                        "Customer: Let's see it play this!\n" +
                        "Man: It's your money!\n" +
                        "\n" +
                        "The Octopus looks at the keyboard and without hesitation, starts to play Moonlight Sonata! The crowd is amazed!\n" +
                        "\n" +
                        "Man: Pay up!\n" +
                        "\n" +
                        "The man pays, but leaves again and goes to his apartment! When he gets back, he places the new instrument in front of the Octopus!\n" +
                        "\n" +
                        "Customer: Let's see if it can play the bagpipes!\n" +
                        "\n" +
                        "The Octopus picks up the bagpipes and looks them over. It takes a toot of the horn, pushes air into the bag, turns it over, toots again, turns it over again and just looks quizzically at it.\n" +
                        "\n" +
                        "Customer: Looks like your Octopus doesn't know how to play it!\n" +
                        "Octopus: Play it? I'm trying to find the hole so I can fuck it!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Pianist = (Button) findViewById(R.id.button13);
        Pianist.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("12 Inch Pianist");
                alertDialog.setMessage("Man walks into a bar and says to the bartender:\n" +
                        "\n" +
                        "Man: I will let my 12 inch pianist play at the bar for free drinks!\n" +
                        "Bartender: Eh...it's a pretty dead night, so sure...\n" +
                        "\n" +
                        "Out from his pocket, the man pulls out a 12 inch man, a tiny piano and a bench! The 12 inch man immediately sits down and starts playing a soulful tune!\n" +
                        "\n" +
                        "Bartender: That is amazing! Where did you find him?\n" +
                        "Man: There is an old genie lamp out in the alley. He gave me one wish!\n" +
                        "\n" +
                        "Before the man could finish, the bartender was running into the alley where he saw the genie lamp! A few minutes later, he comes walking back inside followed by a trove of ducks!\n" +
                        "\n" +
                        "Bartender: What the hell is wrong with that fucking genie? I asked for a million bucks, not a million ducks!\n" +
                        "Man: Yeah? You think I asked for a 12 inch pianist?");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button CatToo = (Button) findViewById(R.id.button3);
        CatToo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Pocket Mouse");
                alertDialog.setMessage("A man sitting at a bar, keeps tipping his beer glass towards his front shirt pocket.\n" +
                        "\n" +
                        "Bartender: Hey bud, I notice you keep pouring a little bit of beer into your shirt pocket!\n" +
                        "Man: Yeah! Ever since my wife died, I have kept this little mouse in my pocket to keep me company, so I give him a little food and beer from time to time! As time goes on, the man and the mouse get super drunk and a bit beligerent!\n" +
                        "\n" +
                        "The man sitting next to him is disgusted by the mouse and tells the man to move! The man refuses and gets angry and challenges the other guy to a fight. \n" +
                        "\n" +
                        "Man: I ain't afraid of any of ya! Why don't all of you sons a bitches come out into the parking lot and I'll fight every single one of'uns!\n" +
                        "\n" +
                        "The mouse jumps up in the man's mans pocket, obviously drunk and says:'\n" +
                        "\n" +
                        "Mouse: Yeah, and bring your fucking cats, too!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Spit = (Button) findViewById(R.id.button4);
        Spit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Scot and Fly");
                alertDialog.setMessage("An Irishman, A Scot and a Frenchman went into a bar together and each ordered a beer! When the beer arrives, inexplicably, there is a fly in each of the three beers! The Frenchman pushes his beer away!\n" +
                        "\n" +
                        "Frenchman: I would never drink beer that has a fly in it!\n" +
                        "\n" +
                        "The Irishman simply takes the fly out of his beer, tosses it over his shoulder and drains the flagon!\n" +
                        "\n" +
                        "After this, the Irishman and the Frenchman both look over to the Scot, who is sitting there with the most angry expression on his, now very red, face! With one deft move, the Scot reaches in and plucks the fly from his beer. He then holds it up in front of his face and starts to scream:\n" +
                        "\n" +
                        "Scot: SPIT IT OUT! SPIT IT OUT, YOU THEIVING BASTARD, SPIT IT OUT!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Beers = (Button) findViewById(R.id.button10);
        Beers.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Irish Brothers");
                alertDialog.setMessage("An Irishman walks into a bar and orders three beers! Everyday for a month, he does this exact same thing, Monday - Friday! Finally, the bartender has to know the reason for the three beers.\n" +
                        "\n" +
                        "Bartender: Hey bud, I notice that every day you come in here and order three beers. Why is that?\n" +
                        "Irish: Well, I order one of the beers for myself, and I order the other two for my two brothers who are still over in Ireland waiting to make their way to America!\n" +
                        "The bartender is satisfied and goes back to his duties! A month later, the Irishman comes into the bar and only orders two beers! The bartender is happy for the man.\n" +
                        "\n" +
                        "Bartender: Congratulations!\n" +
                        "Irish: Oh yeah? For what?\n" +
                        "Bartender: Well, you only ordered two beers, so that must mean that one of your brothers made it here from Ireland, huh?\n" +
                        "Irish: No! Sorry! It's me whose quit drinking, it is!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Pedo = (Button) findViewById(R.id.button8);
        Pedo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Big Words");
                alertDialog.setMessage("A man arrives home one day to see that his wife has all of her things being loaded into the back of a taxi!\n" +
                        "\n" +
                        "Man: What is going on?\n" +
                        "Wife: I'm leaving you! I was watching T.V. today and I realized that you are a pedophile!\n" +
                        "Man: Yeah, well, that's a pretty big word for an 11 year old!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button CIA = (Button) findViewById(R.id.button9);
        CIA.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("CIA");
                alertDialog.setMessage("A man walks into CIA headquarters in Virginia.\n" +
                        "\n" +
                        "Man: I've always wanted to be in the CIA black squad. I finally talked my wife into it and here I am!\n" +
                        "Agent: We've got a program just for people like you! We bring you out of public, put you into a dark room with no outside communications for three days. At the end of three days, we bring you out, give you a glock 9mm and send you into a dark room. Kill the first thing you see move and we'll train you to be in our hit squad!\n" +
                        "\n" +
                        "The guy was very nervous and barely slept or ate during his three day isolation. At the end of the three days, they bring him out of isolation, give him a 9mm and send him into a dark room. After about 2 minutes, the guy comes walking out with his wife under his arm.\n" +
                        "\n" +
                        "Man: You dirty sonofabitches tried to get me to kill my wife!\n" +
                        "Agent: Well, if you can't follow simple directions, give us back the gun and get the fuck out of here!\n" +
                        "Man: Fine! Fuck you!\n" +
                        "\n" +
                        "The next month, another man came along with the same story!\n" +
                        "\n" +
                        "Man: I've always wanted to be in the CIA black squad. I finally talked my wife into it and here I am!\n" +
                        "Agent: We've got a program just for people like you! We put you into a dark room with no outside communications for three days. At the end of three days, we give you a glock 9mm and send you into a dark room. Kill the first thing you see move and we'll train you!\n" +
                        "\n" +
                        "This guy was normal. Slept normal, ate normal! At the end of the three days, they bring him out of isolation, give him a 9mm and send him into a dark room. After about 2 minutes, the guy comes walking out with his wife under his arm.\n" +
                        "\n" +
                        "Man: You dirty sonofabitches tried to get me to kill my wife!\n" +
                        "Agent: Well, if you can't follow simple directions, give us back the gun and get the fuck out of here!\n" +
                        "Man: Fine! Fuck you!\n" +
                        "\n" +
                        "A month goes by and another man shows up with the same story!\n" +
                        "\n" +
                        "Man: I've always wanted to be in the CIA black squad. I finally talked my wife into it and here I am!\n" +
                        "Agent: We've got a program just for people like you! Dark room, no outside communications for three days. At the end, we give you a glock 9mm and send you into a dark room. Kill the first thing you see move and we'll train you!\n" +
                        "\n" +
                        "This guy was worse for wear and slept the entire three days, barely eating. At the end of the three days, they bring him out of isolation, give him a 9mm and send him into a dark room. Immediately you hear gunshots, bang bang bang bang bang click click click click, silence, a scream, wood breaking, silence and then a blood curdling scream and then silence again! After a few minutes, the man appeared in the doorway holding the 9mm in his left hand by the barrel and the broken leg of a chair in the other. The chair leg had a very sharp point and was dripping with blood. The man stumbles out of the room with an angry expression on his face.\n" +
                        "\n" +
                        "Man: You dirty, stinking, lying son of a bitches! There were blanks in that gun! I had to kill that bitch with a chair! \n");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Raining = (Button) findViewById(R.id.button7);
        Raining.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Roommate");
                alertDialog.setMessage("A nerd puts out an ad for a roommate. A male model answers the ad.\n" +
                        "\n" +
                        "Model: I will rarely be here, so I really just need a place to crash every now and then and a safe place to put my stuff!\n" +
                        "Nerd: No problem!\n" +
                        "Model: Hey this is great! Let's celebrate!\n" +
                        "Nerd: Nah! I've never drank alcohol and I prefer to spend my time alone!\n" +
                        "Model: Not so good with the ladies, I take it?\n" +
                        "Nerd: Yeah, something like that!\n" +
                        "Model: Well, tonight, I am going to show you how to pick up a woman 99% of the time! Grab your coat!\n" +
                        "\n" +
                        "The two walk down the street to a bar and enter!\n" +
                        "\n" +
                        "Model: When you enter into a bar, always get the table that is nearest the middle of the room and order two shots of whiskey immediately!\n" +
                        "\n" +
                        "The model motions for the waitress to bring two shots of whiskey each for him and his friend! He slams them down! The nerd is watching and mimicing the model. He grabs his shot glass and gingerly sips it, makes a face and slams down both shots!\n" +
                        "\n" +
                        "Model: Good! Now, scope! Hey, see that blonde that just walked in the bar! Watch and learn!\n" +
                        "Nerd: Ok!\n" +
                        "\n" +
                        "The model walks up to the blonde and leans in to whisper in her ear!\n" +
                        "\n" +
                        "Model: Tickle your ass with a feather?\n" +
                        "Woman: EXCUSE ME?\n" +
                        "Model: Oh no, excuse me! I said 'it's terribly nasty weather we're having outside, isn't it'?\n" +
                        "Woman: My apologies and yes, it is raining terribly!\n" +
                        "Model: Pardon me!\n" +
                        "\n" +
                        "The model heads back to the table and signals for 4 more shots! \n" +
                        "\n" +
                        "Model: When you crash and burn, always get yourself two more shots and slam them down!\n" +
                        "\n" +
                        "The waitress brings the four shots and the men make quick work of slamming them down. The nerd is starting to feel the alcohol!\n" +
                        "\n" +
                        "Model: Hey, you see that red head at the bar?\n" +
                        "Nerd: Yeah!\n" +
                        "Model: Watch and learn!\n" +
                        "\n" +
                        "The model gets up and walks to the bar, as he is leaning in as if to get a napkin, he whispers in the redheads ear:\n" +
                        "\n" +
                        "Model: Tickle your ass with a feather?\n" +
                        "Woman: EXCUSE ME?\n" +
                        "Model: Oh no, excuse me! I said 'it's terribly nasty weather we're having outside, isn't it'?\n" +
                        "Woman: My apologies and yes, it is raining terribly!\n" +
                        "Model: Pardon me!\n" +
                        "\n" +
                        "The model heads back to the table and signals for 4 more shots! \n" +
                        "\n" +
                        "Just after slamming down the shots, a brunette is walking by the table. \n" +
                        "\n" +
                        "Model: Watch and learn!\n" +
                        "\n" +
                        "The model quickly motions for the woman to come closer.\n" +
                        "\n" +
                        "Model: Tickle your ass with a feather?\n" +
                        "Woman: Your place or mine!\n" +
                        "Model: See there, now that is how you do it! Works every time!\n" +
                        "\n" +
                        "As the model is leaving the bar, the nerd is left to finish his drinks. At this point, he is very intoxicated and see's a woman sitting alone near the window. He makes his way over to her and smiles at her drunkenly!\n" +
                        "\n" +
                        "Woman: Can I help you?\n" +
                        "Man: (Voice raised) Hey...you...do you wanna fuck?\n" +
                        "Woman: EXCUSE ME?\n" +
                        "Man: I said 'It's raining like fuck outside, isn't it?'");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button GodGrab = (Button) findViewById(R.id.button5);
        GodGrab.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Circle of Money");
                alertDialog.setMessage("Three men, a Preacher, a Priest and a Rabbi were walking through the woods one day when they found a suitcase filled with cash!\n" +
                        "\n" +
                        "Priest: Let's draw a circle, stand in the middle and throw the bag into the air. What money lands inside the circle, we split and give to our church. What lands on the outside of the circle we split and keep for ourselves!\n" +
                        "Rabbi: My idea is better. Let's draw a circle and stand on the outside and throw the bag into the air. What money lands inside the circle, we keep, what lands on the outside, we give to God!\n" +
                        "Preacher: Y'all both done got it all wrong! Let's draw a circle and throw the money into the air and what god wants he can just grab!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button NYPDBear = (Button) findViewById(R.id.button6);
        NYPDBear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("White Rabbit");
                alertDialog.setMessage("The CIA, NYPD and FBI are all performing a demonstration for the Secratary of state!\n" +
                        "\n" +
                        "SOS: I'm going to release this white rabbit into these woods. FBI, it is your job to retrieve the rabbit! Now, go!\n" +
                        "\n" +
                        "After 10 hours, the FBI comes out of the woods with no rabbit!\n" +
                        "\n" +
                        "SOS: Where is the rabbit!\n" +
                        "FBI: Well, we caught the rabbit, but during interrogations, it came to light that the rabbit is actually a spy for the U.S. so we debriefed the rabbit and let it go!\n" +
                        "SOS: Bullshit! You never caught the rabbit!\n" +
                        "\n" +
                        "The FBI hangs their heads in embarrassment!\n" +
                        "\n" +
                        "SOS: Ok, CIA, now it's your turn. Find that rabbit!\n" +
                        "\n" +
                        "After two hours in the woods, the CIA comes back with nothing!\n" +
                        "\n" +
                        "SOS: Where is the rabbit!\n" +
                        "CIA: Contrary to what the FBI said, we found the rabbit to be a spy against the U.S., so we turned the rabbit into a counterspy, released him back into the wild and he now works for us!\n" +
                        "SOS: Bullshit! You never caught the rabbit!\n" +
                        "\n" +
                        "The CIA hangs their heads in shame!\n" +
                        "\n" +
                        "SOS: Ok, NYPD, now it's your turn! In 15 minutes there was a rumbling at the edge of the forest and out came a huge brown grizzly bear, with lumps all over it's head followed by two detectives, one holding a phone book and the other holding a sock with two oranges in it!\n" +
                        "\n" +
                        "Grizzly: Ok! Fuck it! I'm a white rabbit! Did you hear me? I am a white rabbit!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Nuts = (Button) findViewById(R.id.button);
        Nuts.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Mrs. Johnson");
                alertDialog.setMessage("Two boys, Sean and Wilbur walking down the street after school one day.\n" +
                        "\n" +
                        "Sean: Mrs Johnson failed me in sex ed!\n" +
                        "Wilbur: Me too! My dad is going to kill me when he finds out!\n" +
                        "Sean: Mine too!\n" +
                        "Wilbur: You know, I have a good mind to go to school tomorrow and kick Mrs. Johnson straight in her nuts!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Trade = (Button) findViewById(R.id.button21);
        Trade.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Walking Chief");
                alertDialog.setMessage("A man driving along a long stretch of road sees a native american walking up a head. Considering it was a " +
                        "long walk towards any civilization and a sweltering hot day, the man offers the native american a lift! \n" +
                        "\n" +
                        "Man: Hey Chief, can I offer you a ride?\n" +
                        "Cheif: Sure! Thanks!\n" +
                        "Man: Just put your groceries in the trunk!\n" +
                        "\n" +
                        "As they were driving down the road, Chief looks between his legs and sees a brown paper bag with what " +
                        "appears to be a bottle inside. \n" +
                        "\n" +
                        "Chief: What's in the bag?\n" +
                        "Man: Oh! It's a bottle of fine, aged Whiskey! I got it for my wife!\n" +
                        "\n" +
                        "Chief looks at the bottle for a moment impressed and then finally says to the man:\n" +
                        "\n" +
                        "Chief: Hmmmm....Good trade!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });


        Button Freeze = (Button) findViewById(R.id.button22);
        Freeze.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Freeze");
                alertDialog.setMessage("A native american walking down the road during a heat wave carrying groceries back from town. A man in a very expensive sports car stops to ask the man if he wants a lift:\n" +
                        "\n" +
                        "Man: Hey Chief, need a ride?\n" +
                        "Chief: Sure! Thanks!\n" +
                        "\n" +
                        "Chief gets into the car and starts to drive away. The man driving see's chief looking around the expensive car and decides to show off a little, so he increases the speed to 100mph.\n" +
                        "\n" +
                        "Chief: Why runnem so fast?\n" +
                        "Man: Well Chief, it's like this, this is an expensive sports car, so the faster I run it, the cooler it stays.\n" +
                        "Chief: hmmmmm ok\n" +
                        "\n" +
                        "The man see's that Chief is nervous, but decides to have a little more fun and runs the vehicle even faster.\n" +
                        "\n" +
                        "Chief: WHY RUNNEM SO FAST?\n" +
                        "Man: Chief, I have done explained it. The faster something goes, the cooler it can become!\n" +
                        "\n" +
                        "Just then, Chief see's his house on the side of the road and tells the man. The man stops and Chief thanks him and the man drives off. Chief goes into his house and puts away his groceries and upon finishing, immediately goes out and jumps on his horse and starts to run him down the road. Faster and faster they ride until the horse stops dead in its tracks and keels over in one of Chiefs neighbors yards. The neighbor sees what is happening and comes outside to inspect:\n" +
                        "\n" +
                        "Neighbor: Dang Chief! Looks like you killed your horse! What happened?\n" +
                        "Chief: Me don't know. Must have frozem to death!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Stick = (Button) findViewById(R.id.button23);
        Stick.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Stick");
                alertDialog.setMessage("The last man on his land, a native american Chief decides it is time to sell his lucrative land to the big oil companies and start living life like a civilized man. After getting his money and packing his things, Big Chief walks into town and immediately goes to a local house of ill refute:\n" +
                        "\n" +
                        "Madame: Can I help you, Chief?\n" +
                        "Big Chief: Me Big Chief! Me havem money, now wantem whore!\n" +
                        "Madame: Well, see here Big Chief, you stink! What I need for you to do is to go down to the wash house and clean yourself up. Come back when you are done and I'll get you a girl.\n" +
                        "\n" +
                        "The next day Big Chief returns:\n" +
                        "\n" +
                        "Big Chief: Me Big Chief! Me havem money! Me takem bath so smell good! Wantem whore!\n" +
                        "Madame: Well, listen Big Chief, the problem isn't that you stink, it is that your clothes stink. Head on over to the tailor and have him get you some new duds. When you get finished, come on back over and I'll get you a girl. \n" +
                        "\n" +
                        "The next day Big Chief returns:\n" +
                        "\n" +
                        "Big Chief: Me big Chief! Me havem money! Me takem bath, smell good! Me get new duds, look good! Wantem whore!\n" +
                        "Madame: Well, one more thing there Big Chief. I've heard that you have live alone for the last 30 years. That's a long time to be without a woman. What I want you to do is to get some practice. Now, at the end of town is an old oak tree with a hole in it about perfect for a man to enter. Go down and practice on that tree for a while and when you are done, come back and I will get you a girl. \n" +
                        "\n" +
                        "A few weeks later, Big Chief returned:\n" +
                        "\n" +
                        "Big Chief: Me Big Chief! Havem money! Takem bath, smell good. Got new duds, look good! Practiced, so will be good!\n" +
                        "Madame: It's been a long time, Chief! I thought maybe you had left. Alright! Go up to the first room at the top of the stairs and I will send a girl up. \n" +
                        "\n" +
                        "5 minutes after the Madame had sent the most diseased wretch of a woman up to the Chief's room, she heard a woman screaming for dear life. All the staff ran to the room and the madame opened the door. There, at the end of the bed was Big Chief with a long tree branch. The woman was standing at the head of the bed.\n" +
                        "\n" +
                        "Madame: Big Chief, what in the hell are you doing?\n" +
                        "Big Chief: Big Chief checkum for bees!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Deer = (Button) findViewById(R.id.button24);
        Deer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Deer");
                alertDialog.setMessage("A reporter goes to a native american reservation to do a report on the social aspects of the occupants of the reservation. A man walked out to greet them wearing a very large headdress adorned with hundreds of feathers.\n" +
                        "\n" +
                        "Reporter: Big Chief, what do all the feathers in your head piece represent?\n" +
                        "Big Chief: Big, little, small, Big Chief has laid them all!\n" +
                        "Reporter: Well, just exactly what does that mean, Big Chief?\n" +
                        "Big Chief: Every feather is a woman I have laid with. Big, little, small, Big Chief has laid them all!\n" +
                        "Reporter: Oh dear!\n" +
                        "Big Chief: No deer! Ass too high, run too fast! ");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Hush = (Button) findViewById(R.id.button25);
        Hush.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Hush");
                alertDialog.setMessage("A man called his supervisors house to inquire about something work related. After the phone rang once, a little girl picked up the phone and whispered:\n" +
                        "\n" +
                        "Girl: (Whispers) Hello?\n" +
                        "Man: Yes, I am looking for your father. Is he around!\n" +
                        "Girl: (Whispers) Yes!\n" +
                        "Man: Well, may I speak with him!\n" +
                        "Girl: (Whispers) No!\n" +
                        "Man: Is there anybody else around?\n" +
                        "Girl: (Whispers) My Mom.\n" +
                        "Man: May I speak with your Mom?\n" +
                        "Girl: (Whispers) No!\n" +
                        "Man: Is there anybody else there?\n" +
                        "Girl: (Whispers) Yes, the policeman!\n" +
                        "Man: May I speak with the policeman?\n" +
                        "Girl: (Whispers) No, he's busy talking to Mom and Dad and the firefighter is running out to meet with the helicopter!\n" +
                        "Man: Helicopter?\n" +
                        "Girl: (Whispers) Yes, the search team just landed.\n" +
                        "Man: Search team? OMG, what is going on there. Who are they searching for?\n" +
                        "Girl: (Whispers and Giggling) ME!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button BigTex = (Button) findViewById(R.id.button26);
        BigTex.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("BigTex");
                alertDialog.setMessage("A man from New York walked into an Amarillo, Texas bar that was located in the hotel he was staying in. The man sauntered up to the bar and ordered a beer. When the beer arrived, it was huge, at least twice the size of a normal beer from New York.\n" +
                        "\n" +
                        "Man: Damn, that is one big beer!\n" +
                        "Bartender: Yep, everything's big in Texas!\n" +
                        "Man: I suppose it is! Can I get a bowl of your daily special Chili?\n" +
                        "Bartender: Yep! Coming right up!\n" +
                        "\n" +
                        "When the bowl of Chili arrived, it was a giant bowl of chili!\n" +
                        "\n" +
                        "Man: Wow! That is one huge bowl of Chili!\n" +
                        "Bartender: It's like I said before, everything's big in Texas!\n" +
                        "\n" +
                        "After a couple of beers and a bowl of Chili, the man needed to use the restroom!\n" +
                        "\n" +
                        "Man: Hey bartender, where's the bathroom in this place?\n" +
                        "Bartender: Go down the hall, make a right and it is the first door on your right!\n" +
                        "\n" +
                        "The man goes down the hallway, makes his first left and goes into the first door on his right. It is dark in the room and the man can find no light switch. After taking a couple of steps, the man slips and falls into the hotels olympic sized swimming pool. Aware of his situation, and fearing for his life, the man starts to scream:\n" +
                        "\n" +
                        "Man: DON'T FLUSH! DON'T FLUSH!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Bill = (Button) findViewById(R.id.button27);
        Bill.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Bill");
                alertDialog.setMessage("A man opens a bar in a dusty old western town and business is going pretty good for the first few days when suddenly a man came busting into the bar announcing that Wild Bill was a'comin! Immediately, the bar emptied. Shop keepers closed their shops and locked their doors. Residents closed their shutters, and grabbed their children from playing in the streets. The bartender looks out at the open land before his bar and the recently ghosted town and could see, in the distance, a cloud dust. As the cloud of dust moved closer, the bartender could see that the man was riding on the back of a mountain lion. In his teeth was a bouy knife and in his right hand were six rattlesnakes that he was using as a whip. He had weapons on his hips, and rifles rising above both shoulders just ready to be pulled and used. The man finally made it to the bar, harnessed his mountain lion, walked inside and threw his snakes in the whip bucket. Behind the bar, the bartender was shaking like a leaf:\n" +
                        "\n" +
                        "Bartender: Can I help you with something, sir?\n" +
                        "Man: Yeah! Give me a shot of red eye and be quick about it!\n" +
                        "Bartender: Yes...yes sir! Here ya go!\n" +
                        "\n" +
                        "The man grabbed the shot and slammed it down without a wince!\n" +
                        "\n" +
                        "Bartender: Sir, would you like another shot of red eye?\n" +
                        "Man: Hell no! Ain't got no time! Wild Bill's a'comin! Ain't you heard?");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Alley = (Button) findViewById(R.id.button28);
        Alley.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Alley");
                alertDialog.setMessage("A homeless man passes out in the alley behind a gay bar. During the night, a patron of the bar goes to the alley to piss when he sees the homeless man laying there passed out. Thinking to himself that the man would be none the wiser, he pulls the homeless man's pants down and rapes him. Feeling bad about what he just did, he puts five dollars into the mans pocket. When the bum woke up the next morning, his pants were down around his ankles. Pulling them up, he found the five dollars in his pocket and immediately went to the liquor store.\n" +
                        "\n" +
                        "Owner: What can I get for you today?\n" +
                        "Man: What's the cheapest stuff you got?\n" +
                        "Owner: We got two bottles of this 100 proof rye for $5.\n" +
                        "Man: Give me two of those!\n" +
                        "\n" +
                        "That night, the man again passed out in the alley and the same patron came out into the alley again. Only, this time, he brought a friend! After finishing with the man, they each placed a $5 bill in the guys pocket. When the man woke up, he found his pants down around his ankles again, but this time with two $5 bills in his pockets. He immediately goes to the liquor store.\n" +
                        "\n" +
                        "Owner: What can I get for you today?\n" +
                        "Man: Four bottles of the rye!\n" +
                        "\n" +
                        "That night, the man passed out in the same place. The patron returned with three friends! After finishing with the man, they each put a $5 bill in his pocket. When he woke the next morning, his pants were down again, but this time, he found $20 in his pockets. He immediately went to the liquor store.\n" +
                        "\n" +
                        "Owner: Let me guess, you want some more of the $5 rye?\n" +
                        "Man: Hell no! Give me some of that top shelf stuff. That rye is tearing my asshole apart!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button GayAsh = (Button) findViewById(R.id.button29);
        GayAsh.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("GayAsh");
                alertDialog.setMessage("A gay man passes away and leaves his ashes to his three lovers. At the wake, the three men discussed what they were going to do with their share of the ashes.\n" +
                        "\n" +
                        "Lover1: I'm going to take the ashes up to the top of the local mountain and dump them over the edge of the first place that he and I made love!\n" +
                        "Lover2: I'm going to take my share to the beach and dump them in the ocean because it was on the beach that he and I first made love!\n" +
                        "Lover3: I'm going to take my share of the ashes and make up a huge pot of super hot chili and dump the ashes in there!\n" +
                        "\n" +
                        "The other two look dismayed and confused! \n" +
                        "\n" +
                        "Lover1: Why?\n" +
                        "Lover2: Why would you do something like that?\n" +
                        "Lover3: Because...I want him to burn my ass up, just one last time!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Ruler = (Button) findViewById(R.id.button30);
        Ruler.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Ruler");
                alertDialog.setMessage("I met a girl at a bar and we decided to go back to her place and fool around. When we got there, she got undressed, undressed me and then said:\n" +
                        "\n" +
                        "Woman: I want you to give me all twelve inches! And make it hurt!\n" +
                        "\n" +
                        "So, I fucked her three times and punched her in the back of the head!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Fridge = (Button) findViewById(R.id.button31);
        Fridge.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Fridge");
                alertDialog.setMessage("Three men arrive in heaven at the same time and ask to be allowed in. St. Peter tells the men that they have to describe the way he died and then it is up to God whether to allow him in or not. \n" +
                        "\n" +
                        "Man1: Well, I've suspected for a while that my wife had been cheating on me with another man so I came home early from work on purpose. When I got back to the apartement she was lying naked in bed like she had just been having sex. I checked under the bed and there was no one there. I checked in the closet and there was no one there, so I looked on the balcony and there was some guy hanging from the railing. I got so angry I beat his hands until he fell, then I ran back in the apartement, grabbed the refridgerator, brought it back out, and dropped over the railing right on top of him. Then the stress gave me a heart attack, I died and here I am!\n" +
                        "\n" +
                        "God agree's that this man has had it rough and allows him into heaven!\n" +
                        "\n" +
                        "Man2: I was in my apartment when I slipped and fell over the railing. I was able to grab onto the railing of the apartement below me but then this guy starts pounding on my fingers until I fell. I was still alive, but both of my legs were broken. I heard the man screaming and when I looked up, a refrigerator came tumbling out the window and drops straight on me and now I'm here!\n" +
                        "\n" +
                        "God hears his story and allows him into heaven!\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Man3: Ok! So, I'm banging this married chick, right, when suddenly, her husband comes home early. So, I go and hide in the refrigerator...\n" +
                        "\n" +
                        "\n");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Hobos = (Button) findViewById(R.id.button32);
        Hobos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Hobos");
                alertDialog.setMessage("Two hobo's are walking down some train tracks talking about how hungry they are when the come up on an old, maggot infested pig! One of the hobo's looks at the pig and says:\n" +
                        "\n" +
                        "Hobo1: Man, I'm so hungry, I could eat this infested pig!\n" +
                        "Hobo2: Not me!\n" +
                        "Hobo1: Well, that means there is just more for me!\n" +
                        "\n" +
                        "Hobo1 starts to cut the pig open and cuts a few good slabs of meat off and eats it right there, raw! After finishing, the begin walking again. Suddenly, the hobo that had eaten of the pig bends over and vomits up the pig. \n" +
                        "\n" +
                        "He looks at hobo2 who is just standing there smiling from ear to ear!\n" +
                        "\n" +
                        "Hobo1: What are you smiling about? You waiting to tell me \"I told you so\"?\n" +
                        "Hobo2: Nawp!\n" +
                        "Hobo1: Then what are you so happy about?\n" +
                        "Hobo2: It's just what I have been wanting! A warm meal!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Qball = (Button) findViewById(R.id.button33);
        Qball.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Qball");
                alertDialog.setMessage("A guy walks into a bar with a monkey. The bartender is very skeptical.\n" +
                        "\n" +
                        "Bartender: Hey man, get that fucking monkey out of the bar!\n" +
                        "Man: The monkey is my drinking buddy and he is very friendly. Please let him stay with me. \n" +
                        "Bartender: Ok, but if that monkey does anything, you're both out of here!\n" +
                        "\n" +
                        "The man gets the monkey a few beers. After the third beer, the monkey jumps up onto the bar, runs to the end and grabs a handful of pretzels and stuffs them into its mouth. He then jumps to a table of women, grabs a handful of marichino cherries and stuffs them into his mouth. He then jumps to the pool table, grabs the que ball and swallows it whole! The bartender has seen enough.\n" +
                        "\n" +
                        "Bartender: Get that fucking monkey out of my bar!\n" +
                        "\n" +
                        "The man and the monkey leave, but return a few months later. The bartender sees them come in and immedately asks them to leave.\n" +
                        "\n" +
                        "Bartender: Get that fucking monkey out of my bar!\n" +
                        "Man: Hey, I figured out that last time, I gave him too much beer. His behaviour is much more easy going with only two beers. \n" +
                        "Bartender: Ok, but if that monkey acts up one more time, I am going to ban you from this bar!\n" +
                        "\n" +
                        "After two beers, the monkey jumped up on the bar and ran down to the end and grabbed a single pretzel, shoved it up his ass, then pulled it out and ate it. He ran to the other side of the bar where he grabbed a single peanut, shoved it up his ass, pulled it out and ate it.\n" +
                        "\n" +
                        "Bartender: Man, that is disgusting! What in the hell is he doing that for?\n" +
                        "Man: Well, ever since he ate that que ball, he's been making sure that what he puts in his mouth will be able to come out his ass!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Bet = (Button) findViewById(R.id.button34);
        Bet.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Bet");
                alertDialog.setMessage("A man walks into a bar and challenges the bartender for free drinks. \n" +
                        "\n" +
                        "Man: I bet I can bounce three quarters into a shot glass from the other end of the bar!\n" +
                        "Bartender: Impossible!\n" +
                        "Man: If I can do it, you give me free drinks for the rest of the night. If not, I will leave your bar and never return!\n" +
                        "Bartender: Deal!\n" +
                        "\n" +
                        "The man goes to the end of the bar, lines the shots up and makes them with little effort. The bartender is amazed, but having have his word, he brings the man a drink. The man takes his drink and goes to a booth at the back and strikes up a conversation with the patrons there. After a while, he comes back to the bar.\n" +
                        "\n" +
                        "Man: Hey bartender, I bet you $100 that you can take a shot glass, and slide it the length of the bar and that I can piss in it and not get a single drop on your bar! If I get one single drop of piss on your bar, you get $100! If not, you owe nothing! The bartender thought about it and finally agreed. He set the shot up and the man stood up on top of a bar stool. The bartender released the drink, and the man pissed all over the bar, not even getting one drop of piss into the shot glass. The bartender started laughing. The man got down and want back to the table he was just at. When he came back to the bar, he gave the bartender the $100. The bartender was confused.\n" +
                        "\n" +
                        "Bartender: When you came in here, you were so broke you couldn't afford drinks. Then you lost a bet with me and gave me $100 for it. How is that?\n" +
                        "Man: Well, see those guys over in that booth I was speaking with?\n" +
                        "Bartender: Yeah!\n" +
                        "Man: Well, I bet those men $1000.00 that I could piss all over your bar and you would laugh about it!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Time = (Button) findViewById(R.id.button35);
        Time.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Time");
                alertDialog.setMessage("A man walks into a bar in NM. He notices that there is a bartender, a patron and a donkey standing next to the patron. He walks to the bar and asks for a beer. After a while, he notices that he forgot his watch, so he asks the man with the donkey what time he has. The man reaches across to the donkey, grabs its balls and lifts them as if weighing them. \n" +
                        "\n" +
                        "Patron: It's about 2pm\n" +
                        "\n" +
                        "The man is impressed. After a few more beers, he asks the patron again what time he has. The patron once again weighs the donkey's balls:\n" +
                        "\n" +
                        "Patron: It's about 5pm\n" +
                        "\n" +
                        "The man, equally impressed, has a few more beers, and once again, asks the man for the time. The man weighs the donkey balls again:\n" +
                        "\n" +
                        "Patron: It's a quarter to six!\n" +
                        "Man: You know, it's pretty amazing how you tell time. The old ways must be strong with you. Tell me, how is it you can tell time just by lifting up some donkey balls. \n" +
                        "\n" +
                        "The patron thinks about this for a minute, motions the man to come down to this eye level, lifts the donkey balls and points under them to the other side of the room:\n" +
                        "\n" +
                        "Patron: You see that clock on the wall over there?");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button King = (Button) findViewById(R.id.button36);
        King.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("King");
                alertDialog.setMessage("A lion was walking through his territory, when he came across a monkey. He ran up to the monkey, grabs it by the neck and starts to punch it.\n" +
                        "\n" +
                        "Lion: I'm the king of the jungle. Say it! Say I'm the king of the jungle!\n" +
                        "Monkey: Damn man, you're the king of the jungle!\n" +
                        "\n" +
                        "The lion releases the monkey and goes on his way. Suddenly, he see's a rabbit. He gives chase, catches the rabbit:\n" +
                        "\n" +
                        "Lion: I'm the king of the jungle. Say it! Say I'm the king of the jungle!\n" +
                        "Rabbit: Fine asshole, you're the king of the jungle! Happy?\n" +
                        "\n" +
                        "The Lion releases the rabbit and continues on his way. In the distance, he can see an elephant and he starts to run towards it. As he approaches it, he jumps up and puts his eyes up close to the elephants and starts punching the elephant between the eyes:\n" +
                        "\n" +
                        "Lion: I'm the king of the jungle. Say it! Say I'm the king of the jungle!\n" +
                        "\n" +
                        "The elephant just grabs the Lion and slams it, again and again, into the ground. The Lion is hurt by this and recoils away from the elephant:\n" +
                        "\n" +
                        "Lion: Damn man, all you had to say was 'NO'!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Lugey = (Button) findViewById(R.id.button37);
        Lugey.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Lugey");
                alertDialog.setMessage("Two Navy Seals and one Army Ranger boarded a plane from Dallas, Tx headed towards Houston, Tx. The Ranger was seated next to the Seals, but was aisle seat. Once seated, the Ranger took off his boots and set them under the chair in front of him. One of the Seal's, seeing this, remarked about how he would like a coke. The Ranger, being ever the gentleman, and the aisle seat, volunteered to get the Seal a coke. While he was gone, the Seal picked up one of his boots and hocked a huge loogy into it. The Ranger came back with the coke and sat down. Immediately, the other Seal mentioned he would also like a coke, so the Ranger went again to get another coke. While he was gone, the other Seal hocked a huge loogie into the other boot of the Ranger. Once he got back and handed the drink to the Seal, he was able to sit an relax. The flight was short and when it landed, the Ranger reached under the seat and started to put on his boots. As soon as he put his first foot in the boot, he let out a sigh.\n" +
                        "\n" +
                        "Ranger: Guys...this is unacceptable! We are supposed to be brothers in arms. We are supposed to be on the same side. Let's just stop it with all this ridiculousness...this spitting into other peoples boots and this pissing in other peoples cokes!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Ranger = (Button) findViewById(R.id.button38);
        Ranger.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Ranger");
                alertDialog.setMessage("A battalion of Marines had come down to Ft. Stewart, Ga for the annual Ranger vs. Marines competition. When the Marines graduate from Basic training, they are sometimes told that they are the equivilent of a U.S. Army Ranger. Since this annoys the Rangers, they allow the Marines to come down and be defeated every year. This year was no different and the Colonel of the Marine battalion was in front of his troops giving them a piece of his mind. When he turned around to face the ocean, he noticed that a Ranger had popped up and was looking at him. The Ranger saw the Colonel, flipped him off and dove down behind a sand dune. The Colonel was beside himself with indignation and ordered that two of his men head over the dune and bring the Ranger to him so that he could have the soldier brought up on charges. The two Marines headed over the dune and there was an instant fight. Helmets flew, sand dusted up and there was a great noise. As fast as it began, the commotion stopped and the Ranger popped back up, no worse for wear, looked at the Colonel and flipped him off again, this time with both hands! The Colonel was almost apoplectic. He ordered that an entire squad of soldiers go over that dune and bring the Ranger back. They marched over the dune and once again there was an instant fight. Helmets and sand flying through the air, boots came unlaced and rocketed through the air...then silence. The Ranger popped up again, looking as fresh as at first and made nanananabooboo motions, putting his hands on top of his head and sticking his tongue out at the Colonel. He then flipped him off again and dropped back down behind the dune. The Colonel was so incensed that he ordered an entire company of soldiers to go bring him that damned Ranger, but in the distance, a Marine had come crawling back. He was bloody and beaten, his clothes ripped off, his boots missing. The Colonel got a medic up. The man could barely speak, but he kept shaking his head from side to side.\n" +
                        "\n" +
                        "Colonel: Take your time, Son. It's ok. Just take your time! What is going on over there behind that dune?\n" +
                        "Soldier: Sir, don't send any more men! It's a trap!\n" +
                        "Colonel: Just as I suspected! What kind of trap is it?\n" +
                        "Soldier: Sir...it's...it's terrible! There are two of them!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Fence = (Button) findViewById(R.id.button39);
        Fence.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Fence");
                alertDialog.setMessage("An old southern businessman picks up a colleague from New York at the DFW airport. As they were driving back to his ranch, he could see that the man from New York was unaccustomed to the open spaces and livestock. Just before he turned onto the dusty road that would take him to his house, he could see that two cows had gotten their head stuck in the fence. These were old cows, and it was time to put them down, something he had been waiting for the right time to do. Considering that he had scared company, he decided to put on a show and further discomfit the city slicker. He stops the truck, reaches behind him and pulls out large rifle, steps out of the truck, drops his pants, fucks the first cow straight in it's ass, pulls the gun to bear and blows the cows head off. Stepping back, he looks over at the city slicker.\n" +
                        "\n" +
                        "Man: Wanna give it a try?\n" +
                        "City Slicker: Hell yeah (at this he runs and puts his head inside the fence), but just don't shoot me, ok?!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button PopHead = (Button) findViewById(R.id.button40);
        PopHead.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("PopHead");
                alertDialog.setMessage("A truck driver pulls over and gives a ride to a hitchhiker. When the man was in the truck, the driver hit a button his console and a monkey jumped up in the cab of the truck from the bed. The man hits the monkey on the top of the head hard, and the monkey immediately starts to give the man a blowjob. When the man was finished, he hit the monkey hard again, and the monkey went back to the bed. This happened a few times throughout the day. Later in the evening, after the man had the monkey perform head for a 5th time, he looks over at his passenger.\n" +
                        "\n" +
                        "Driver: Say, you wanna give it a try?\n" +
                        "Passenger: Sure, but could you just let me know when to begin instead of hitting me on the head like that?");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Succ = (Button) findViewById(R.id.button41);
        Succ.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Succ");
                alertDialog.setMessage("Three guys sitting around a bar when one of them starts to talk about his son:\n" +
                        "\n" +
                        "Man1: I'm so proud of my son! He is so successful, that last year, as a gift for his best friend, he bought him a new Rolex.\n" +
                        "Man2: Shit, that's nothing! The reason I am so proud of my son is that he is so successful that last year, he bought his best friend a new Porsche!\n" +
                        "Man3: Ah...it's good to be proud of your son! I am very proud of my son. Just last year, he bought his best friend a new house! That's how successful he is!\n" +
                        "\n" +
                        "Man4 walks up to the other three!\n" +
                        "\n" +
                        "Man4: What are you guys talking about?\n" +
                        "Man1: We're telling each other how proud we are of our successful sons!\n" +
                        "\n" +
                        "Man4 thinks about it for a minute and then starts to wipe tears from his eyes. He looks at the others:\n" +
                        "\n" +
                        "Man4: My son is a gay, male prostitute!\n" +
                        "Man2: Ah...so sorry man! That must be tough.\n" +
                        "Man4: Oh no! I'm not crying because I'm ashamed. No! I'm crying because of just how proud of him I am! He is so very successful that just last year he received a Rolex, a Porsche and a house from his three best clients as gifts!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Lost = (Button) findViewById(R.id.button42);
        Lost.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Lost");
                alertDialog.setMessage("Three females were sitting at a bar in midday! A blonde, a brunette and a redhead.\n" +
                        "\n" +
                        "Brunette: My pussy is so loose, I can almost fit a soda bottle up in there!\n" +
                        "Redhead: Oh hell, that's nothing! I can fit a soda bottle up in me, and a 2 liter soda bottle at that!\n" +
                        "\n" +
                        "They both look over at the blonde who is standing beside them crying.\n" +
                        "\n" +
                        "Brunette: Honey, what's the matter? Why are you crying?\n" +
                        "Blonde: I've lost another bar stool!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Knees = (Button) findViewById(R.id.button43);
        Knees.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Knees");
                alertDialog.setMessage("Three women sit around a doctors office. A blonde, a brunette and a redhead. \n" +
                        "\n" +
                        "Brunette: I heard that if the man cums inside of you while you are on your back, you are gonna have a boy! So, I'm gonna have a boy!\n" +
                        "Redhead: I head that if he cums inside of you while you are riding him, you will have a girl. So, I am going to have a girl!\n" +
                        "\n" +
                        "They both look over at the blonde, who had busted out crying!\n" +
                        "\n" +
                        "Brunette: Honey, why are you crying?\n" +
                        "Blonde: I'm going to have puppies!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Sister = (Button) findViewById(R.id.button44);
        Sister.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Sister");
                alertDialog.setMessage("A blonde woman arrives home early from work and finds her husband naked in the bed. \n" +
                        "\n" +
                        "Man: ummmm...I'm having a heart attack. Call the ambulance!\n" +
                        "Blonde: Ok!\n" +
                        "\n" +
                        "The blonde runs downstairs to get her phone, but just then, her 4 year old son comes out of his room. \n" +
                        "\n" +
                        "Son: Mom, why is Aunt Caroline hiding in the closet?\n" +
                        "\n" +
                        "The Blonde slams the phone down, marches upstairs, past her husband and opens the door to the closet. Sure enough, there was her sister, naked as a jaybird.\n" +
                        "\n" +
                        "Blonde: You dumb bitch! My husband is sitting over there having a heart attack, and here you are playing hide and seek with the children in the nude?");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Bridge = (Button) findViewById(R.id.button45);
        Bridge.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Bridge");
                alertDialog.setMessage("A man walking down the beach starts to pray to God:\n" +
                        "\n" +
                        "Man: God, please grant my prayers. My wife has left me and I don't know what to do any longer!\n" +
                        "\n" +
                        "Just then, God spoke to the man!\n" +
                        "\n" +
                        "God: My son, what is it that I can do for you?\n" +
                        "Man: OMG, God! It's so awesome to meet you! If you could grant my prayer, please build a bridge from California to Hawaii!\n" +
                        "God: That would be almost impossible. Imagine the engineering that would have to be done? The drilling, the amount of materials, location settings, constructions crews living on boats for years to complete the project. That just won't work. Give me something else!\n" +
                        "Man: Ok God, can I take some time to think about it?\n" +
                        "God: Sure, take all the time you need!\n" +
                        "\n" +
                        "The man walked the beach a few more hours and finally had his request:\n" +
                        "\n" +
                        "God: Have you decided how I can help you?\n" +
                        "Man: Yes! Please tell me the secret of women. I want to know how they work, what makes them happy, sad...what makes them tick, you know?\n" +
                        "God: So, on that bridge, did you say you wanted two lanes or four?");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button More = (Button) findViewById(R.id.button46);
        More.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("More");
                alertDialog.setMessage("A man walking down the beach finds a lamp, and starts to clean it. A genie pops out and tells the man:\n" +
                        "\n" +
                        "Genie: I will grant you three wishes, but for each wish, the person you hate the most in life will get double what you wish for.\n" +
                        "Man: Well, that would be my ex wife! She has broke me. I'm penniless. My first wish is that I have 1 billion dollars in the bank!\n" +
                        "Genie: Granted. When you next check your bank account, you will see that you have 1 billion dollars in the bank. Your ex-wife, however, will find that she has 2 billion dollars in the bank!\n" +
                        "Man: Fine! I also want a 20 bedroom mansion that overlooks the ocean.\n" +
                        "Genie: Granted. Look in the distance and you will see your new house. Of course, your ex wife will get a 40 bedroom mansion that overlooks the ocean!\n" +
                        "Man: Fine! For my last wish, I will need a little while to think about it.\n" +
                        "Genie: Ok!\n" +
                        "\n" +
                        "The man walks around the beach for a few hours and finally summons the genie:\n" +
                        "\n" +
                        "Genie: Have you decided on your last wish?\n" +
                        "Man: Yes! I wish for you to have me beaten half to death!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Cock = (Button) findViewById(R.id.button47);
        Cock.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Cock");
                alertDialog.setMessage("A man walks into a bar bathroom and sidles up to a urinal. As he is doing so, a leprechuan walks into the bathroom, grabs a trash can, empties it out onto the floor, puts it below the urinal, steps up and pulls his dick out in order to piss. The man standing beside him looks down and is amazed at the size of the leprechuan's dick. \n" +
                        "\n" +
                        "Man: Hey man, how did you get a dick that big?\n" +
                        "Leprechuan: I'm a Leprechuan, we Leprechuan's all have cocks this size!\n" +
                        "Man: Well, if you are a Leprechuan, then you grant wishes?\n" +
                        "Leprechuan: Yes! That is true! You get three wishes!\n" +
                        "Man: I want a cock that size!\n" +
                        "Leprechuan: That is the only thing you cannot wish for!\n" +
                        "Man: Ok, I want a billion dollars!\n" +
                        "Leprechuan: Tomorrow morning, when you wake up, you will be a billionaire!\n" +
                        "Man: Amazing! I want a Bugatti Veyron!\n" +
                        "Leprechuan: Tomorrow morning when you wake up, check your garage and you will see your Bugatti Veyron.\n" +
                        "Man: Ok, now all I need is a cock that size!\n" +
                        "Leprechuan: No! I told you, no cock this size for anyone except for Leprechuan's! That is...unless you allow me to fuck you in the ass with it. That is the only way!\n" +
                        "Man: Hell no! That thing will rip me apart!\n" +
                        "\n" +
                        "\n" +
                        "The Leprechuan jumps down and puts himself away. \n" +
                        "\n" +
                        "Leprechuan: Ok! None of those wishes will now come true. \n" +
                        "\n" +
                        "The man runs towards the door and locks it!\n" +
                        "\n" +
                        "Man: Ok! Fine! But we have to do it inside of a stall!\n" +
                        "Leprechuan: Fine by me!\n" +
                        "\n" +
                        "The man was leaned over the toilet, the Leprechuan behind him feeding him more and more dick!\n" +
                        "\n" +
                        "Man: I cannot believe I'm letting you do this to me!\n" +
                        "Leprechuan: I can't believe that you still believe in Leprechuan's!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Dirt = (Button) findViewById(R.id.button48);
        Dirt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Dirt");
                alertDialog.setMessage("All the worlds scientists and doctors got together to hold a conference. It was discovered that they had been able to make man by using only dirt. It was decided that the doctor or scientist that drew the shortest straw would need to tell God that his services on earth were no longer needed. They drew and a scientist drew the shortest straw. Determined, he went to a clearning and called down God. When God arrived on earth, the scientist told him the skinny of it:\n" +
                        "\n" +
                        "Scientist: God, we no longer need you! I'm sorry to have to be the one to tell you that, but it is true!\n" +
                        "God: Oh my! That is disappointing! Can you at least let me know why you are breaking up with me?\n" +
                        "Scientist: Yes, we have figured out how to make man! Your services are no longer necessary!\n" +
                        "God: Wow! That is amazing! Just to humor me, can you tell me how you make man? I'm very curious about this!\n" +
                        "\n" +
                        "The Scientist reaches down and grabs a handful of dirt. \n" +
                        "\n" +
                        "Scientist: All we needed was a little bit of earth, and we were able to make man!\n" +
                        "\n" +
                        "God looked at the man with amusement and waved his hand in dismissal!\n" +
                        "\n" +
                        "God: No! No! No! Use your own dirt!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Traffic = (Button) findViewById(R.id.button49);
        Traffic.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Traffic");
                alertDialog.setMessage("Three guys get into an argument about who has the biggest dick. They decide to go up on the roof of the building they are in and let them hang down the side of the building to measure. The first guy goes and they can see that his dick hangs down only a few inches!\n" +
                        "\n" +
                        "Man2: Ha! Look at that little thing!\n" +
                        "Man1: Bigger than yours!\n" +
                        "\n" +
                        "Man2 pulls his weiner out and hangs it from the side of the building. It stretches a few inches further than the first guy!\n" +
                        "\n" +
                        "Man2: Yeah bitch! Whose hoggin out now?\n" +
                        "\n" +
                        "Just then, they look over and they can see their friend running side to side on the edge of the building with his hands on his hips!\n" +
                        "\n" +
                        "Man1: What in the hell are you doing?\n" +
                        "Man3: Avoiding traffic!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Pool = (Button) findViewById(R.id.button50);
        Pool.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Pool");
                alertDialog.setMessage("A man goes to the party of a billionaire extreme sports adventure type guy! The man stands before a pool that is filled with alligators and piranhas! The man calls for everyones attention and starts to make a speech! \n" +
                        "\n" +
                        "Billionaire: Today, I am going to give some lucky person a million dollars if they can swim the distance of this swimming pool. \n" +
                        "\n" +
                        "Before the man is even able to finish his statement, a man jumps into the pool and starts to fight fish and gator for dear life. After about 10 minutes of grueling fighting, the man climbs out of the other side of the pool, bloody, and beaten! \n" +
                        "\n" +
                        "Billionaire: Congratulations, guy! You just won a million dollars! What is the first thing you are gonna do?\n" +
                        "Man: Find the sonofabitch that pushed me into this goddamned pool!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Enough = (Button) findViewById(R.id.button51);
        Enough.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Enough");
                alertDialog.setMessage("Two priests are traveling from Europe to the U.S. with hundreds of young foster boys! The boat starts to take on water! Priest1 runs up to Priest2:\n" +
                        "\n" +
                        "Priest1: Father, I've just checked and we don't have enough lifeboats to save both ourselves and the little boys!\n" +
                        "Priest2: Fuck the little boys!\n" +
                        "Priest1: But father, do you think we have the time?");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Boat = (Button) findViewById(R.id.button52);
        Boat.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Boat");
                alertDialog.setMessage("A magician takes a gig doing shows on a cruise ship. Each night, as he is doing his act, a parrot in the back of the room would ruin his tricks!\n" +
                        "\n" +
                        "Parrot: It's up his sleeve! It's fake feet, the bitch isn't sawed in half...\n" +
                        "\n" +
                        "And so on it went. With every trick, the parrot would tell the audience how the trick was done. One night, as the two slept, the boat sank, killing every person onboard, except the man and the bird. They were stranded on a large piece of wood, one of one end and the other on the other end. Neither spoke to the other. Finally, after three days of silence after the sinking, the bird had had enough:\n" +
                        "\n" +
                        "Parrot: Ok, fuck it, I give up! Where's the goddamned boat?");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button HeyLady = (Button) findViewById(R.id.button53);
        HeyLady.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("HeyLady");
                alertDialog.setMessage("Each morning a lady walks by a pet shop on her way to work. One morning, as she is walking past, she sees a parrot sitting outside. As she approached, the parrot looked at her:\n" +
                        "\n" +
                        "Parrot: Hey lady!\n" +
                        "Lady: Yes?\n" +
                        "Parrot: You are fucking ugly!\n" +
                        "\n" +
                        "The lady was highly offended and walked to work dismayed! When she was walking home, the parrot was still outside:\n" +
                        "\n" +
                        "Parrot: Hey lady...\n" +
                        "Lady: Yes?\n" +
                        "Parrot: You are fucking ugly!\n" +
                        "\n" +
                        "The lady was, once again, very offended and walked home with tears in her eyes. This happened every day until on the fourth day, on her way to work, she ignored the Parrot:\n" +
                        "\n" +
                        "Parrot: Hey lady...\n" +
                        "\n" +
                        "Instead of responding, she went straight inside and spoke with the owner.\n" +
                        "\n" +
                        "Lady: This parrot has been harrassing me every day telling me that I am fucking ugly and I want it to stop!\n" +
                        "Owner: I am so sorry for this. We got him from a pimp who didn't treat him well. I guarantee you that the bird will never again tell you that you are fucking ugly!\n" +
                        "\n" +
                        "That day, as she walked home from work, the parrot looked at her!\n" +
                        "\n" +
                        "Parrot: Hey lady...\n" +
                        "Lady: Yes?\n" +
                        "Parrot: You know!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Beans = (Button) findViewById(R.id.button54);
        Beans.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Beans");
                alertDialog.setMessage("A man buys a motorcycle, but as it is used, he has to keep vaseline around his speedometer in order to keep the rain out. As this is the case, he keeps a jar of vaselilne in his pocket. One day, he was going over to his girlfriends house to have dinner with her parents, and when he got there she met him out on the porch. \n" +
                        "\n" +
                        "Girl: Listen, we have a bet going on in the house. The first person to speak at the dinner table is the person who has to wash the dishes. There are a ton of dishes in the kitchen, just waiting for someone to lose! So, don't speak, at all, or you will have to wash them!\n" +
                        "\n" +
                        "The boy agrees, and they go inside the house! Realizing that nobody will say a word to him, he grabs his girlfriend and kisses her passionately in front of her parents. The Dad appears very angry, but says not a word. The boy then grabs the wife, pulls up her skirt and has his way with her right then and there on the kitchen table with everyone watching. The Dad, angry as ever, refuses to speak a word. The boy sits down with a smile on his face. Just then, in the distance, the rumble of thunder and a streak of lightening. The young man stands up, reaches into his pocket and pulls out the little jar of vaseline!\n" +
                        "\n" +
                        "Dad: Ok, fuck it! I'll wash the dishes!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Dishes = (Button) findViewById(R.id.button55);
        Dishes.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Dishes");
                alertDialog.setMessage("A man buys a motorcycle, but as it is used, he has to keep vaseline around his speedometer in order to keep the rain out. As this is the case, he keeps a jar of vaselilne in his pocket. One day, he was going over to his girlfriends house to have dinner with her parents, and when he got there she met him out on the porch. \n" +
                        "\n" +
                        "Girl: Listen, we have a bet going on in the house. The first person to speak at the dinner table is the person who has to wash the dishes. There are a ton of dishes in the kitchen, just waiting for someone to lose! So, don't speak, at all, or you will have to wash them!\n" +
                        "\n" +
                        "The boy agrees, and they go inside the house! Realizing that nobody will say a word to him, he grabs his girlfriend and kisses her passionately in front of her parents. The Dad appears very angry, but says not a word. The boy then grabs the wife, pulls up her skirt and has his way with her right then and there on the kitchen table with everyone watching. The Dad, angry as ever, refuses to speak a word. The boy sits down with a smile on his face. Just then, in the distance, the rumble of thunder and a streak of lightening. The young man stands up, reaches into his pocket and pulls out the little jar of vaseline!\n" +
                        "\n" +
                        "Dad: Ok, fuck it! I'll wash the dishes!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Hang = (Button) findViewById(R.id.button56);
        Hang.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Hang");
                alertDialog.setMessage("A man picked up his date at her house. She was a special date as she had no legs. Once they had eaten dinner, she had him drive her to her favorite spot. Then she started making out with the guy, then got undressed. \n" +
                        "\n" +
                        "Girl: Hey, you see that tree over there?\n" +
                        "Boy: Yes!\n" +
                        "Girl: Take me over there and hang me on that branch and fuck the hell out of me!\n" +
                        "\n" +
                        "The boy agreed, and took the girl over to the tree and had his way with her. She was like an animal. When it was over, the boy helped the girl down, got her dressed and took her back to her house. When he arrived, the whole family was out on the front lawn waiting for them. The boy was embarrassed.\n" +
                        "\n" +
                        "Father: Son, I just want to thank you so much.\n" +
                        "Boy: What for, Sir?\n" +
                        "Father: For not leaving her hung up in that tree! You have no idea how aggravating it is to have to go up there after every date and get her down from there!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Snitch = (Button) findViewById(R.id.button57);
        Snitch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Snitch");
                alertDialog.setMessage("A little boy was sitting on his couch watching T.V. when he looked out his window at a loud noise. Across the street, men with prison uniforms were directing traffic and performing road maintenance. The little boy was amazed:\n" +
                        "\n" +
                        "Boy: Mom, can I go across the road and see those men?\n" +
                        "Mom: Absolutely not! Those men are gang members, murderers and robbers. If you go out there, I will tell your father and he will ground you for a month.\n" +
                        "\n" +
                        "The little boy thought about it for a second and as soon as his mothers back was turned, the little boy was out the door and in the street hanging out with the inmates. The mother came back to the living room, only to see the little boy out in the street talking with the prisoners. She went to the door and angrily called the little boy back to the house.\n" +
                        "\n" +
                        "Mom: Your father is going to be furious when he gets home! I am going to let him know just how disrespectful you have been today, disobeying me and hanging out in the streets with known felons!\n" +
                        "Boy: Fuck you, you snitchin ass bitch! I was hittin the fence tonight anyways!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button NotOne = (Button) findViewById(R.id.button58);
        NotOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("NotOne");
                alertDialog.setMessage("This little boy walked into a mall bathroom and saw a prison guard standing near the sinks:\n" +
                        "\n" +
                        "Boy: WOW MISTER, are you really a prison guard, what that keeps all the murders, thieves and rapists in prison?\n" +
                        "Prison Guard: Sure am, kid! Here, why don't you wear my hat while I take a piss!\n" +
                        "\n" +
                        "While the little boy was standing there wearing the hat of the prison guard, a very drunk Navy personnel member walked into the bathroom. \n" +
                        "\n" +
                        "Boy: WOW MISTER, are you really a Navy man, what that rides on those big boats with the airplanes and stuff?\n" +
                        "Navy Guy: Shure am, kid! WHY? Did you want to suck my dick while I take a shit?\n" +
                        "Boy: Oh? Oh no! There's been a mistake! I'm not a prison guard! I'm just wearing ones hat!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button PokeAss = (Button) findViewById(R.id.button59);
        PokeAss.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("PokeAss");
                alertDialog.setMessage("Little Susy was sleeping in class one day in catholic school, when the headmistress called on her to answer a question:\n" +
                        "\n" +
                        "Nun: Susy, who created the heavens and the universe?\n" +
                        "\n" +
                        "Little Johnny sat behind Susy. Seeing that she was asleep, he pulled a sewing needle from his bookbag and poked her in the ass with it. \n" +
                        "\n" +
                        "Susy: GOD ALMIGHTY!\n" +
                        "Nun: Very good, Susy!\n" +
                        "\n" +
                        "The teacher went through the other students and had another question for Susy.\n" +
                        "\n" +
                        "Nun: Susy, tell me who our lord and savior is?\n" +
                        "\n" +
                        "Johnny once again poked Susy in the ass with the needle.\n" +
                        "\n" +
                        "Susy: JESUS CHRIST!\n" +
                        "Nun: Very good, Susy!\n" +
                        "\n" +
                        "The nun made another sweep of questions and points at Susy again.\n" +
                        "\n" +
                        "Nun: Susy, what did Eve tell Adam on the day of the birth of their 23rd child?\n" +
                        "\n" +
                        "Once again, Johnny poked Susy in the ass. This time, however, Susy'd had enough and jumped to her feet, turning to face Johnny:\n" +
                        "\n" +
                        "Susy: I SWEAR TO GOD, YOU MOTHERFUCKER, IF YOU POKE ME WITH THAT THING AGAIN, I AM GOING TO BREAK IT IN HALF!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Hot = (Button) findViewById(R.id.button60);
        Hot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Hot");
                alertDialog.setMessage("A man named Mike Johnson travels down to Cuba for a business trip. When he gets there, he remembers that he promised to send his wife, Joanne, an email letting her know he had arrived safely. As he and his wife rarely communicated via email, he could barely remember her email address. Mike sends the email to the address he thinks is correct. If it's not right, no harm, no foul! \n" +
                        "\n" +
                        "An old lady sitting in a church office in Pittsburgh was going through her email. She needed something to distract her from the fact that she was now alone since her husband and the pastor of the church, Mike, had passed away. As she looked, she came across an email from Mike from the day before, with the time less than an hour after Mike had passed away. When she read the email, she fainted:\n" +
                        "\n" +
                        "Hi honey, told you I would try to write to you once I got here! Made it safely, but boy, it sure is hot down here!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Moses = (Button) findViewById(R.id.button61);
        Moses.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Moses");
                alertDialog.setMessage("A drunk man was walking along the riverside path of a park, when he sees a baptism going on. Not knowing what they were doing, he decides to join the party! As he steps up, he is invited to come into the water and to get baptized and saved. Not wanting to disappoint the crowd that was patting him on the back and paying attention to him, he steps into the water, however, he is not sure what he is supposed to be doing. The pastor grabs him by the neck, clasps his hands over his nose and dunks the drunk into the river. When he brings him back up, he asks:\n" +
                        "\n" +
                        "Pastor: Did you find Jesus, my son?\n" +
                        "Drunk: No!\n" +
                        "Pastor: Well then, lets give you another go!\n" +
                        "\n" +
                        "The pastor dunks the drunk again, and again brings him back up, asking the same thing:\n" +
                        "\n" +
                        "Pastor: Did you find Jesus that time, son?\n" +
                        "Drunk: Not that time, no!\n" +
                        "\n" +
                        "The pastor dunks the drunk a third time. Bringing him back to his feet, he asks him the question again:\n" +
                        "\n" +
                        "Pastor: Did you find Jesus this time, son?\n" +
                        "Drunk: (Sputtering water) No, but I have to ask you, are you sure that this is where he fell in?");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button River = (Button) findViewById(R.id.button62);
        River.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("River");
                alertDialog.setMessage("A drunk man was walking along the riverside path of a park, when he sees a baptism going on. Not knowing what they were doing, he decides to join the party! As he steps up, he is invited to come into the water and to get baptized and saved. Not wanting to disappoint the crowd that was patting him on the back and paying attention to him, he steps into the water, however, he is not sure what he is supposed to be doing. The pastor grabs him by the neck, clasps his hands over his nose and dunks the drunk into the river. When he brings him back up, he asks:\n" +
                        "\n" +
                        "Pastor: Did you find Jesus, my son?\n" +
                        "Drunk: No!\n" +
                        "Pastor: Well then, lets give you another go!\n" +
                        "\n" +
                        "The pastor dunks the drunk again, and again brings him back up, asking the same thing:\n" +
                        "\n" +
                        "Pastor: Did you find Jesus that time, son?\n" +
                        "Drunk: Not that time, no!\n" +
                        "\n" +
                        "The pastor dunks the drunk a third time. Bringing him back to his feet, he asks him the question again:\n" +
                        "\n" +
                        "Pastor: Did you find Jesus this time, son?\n" +
                        "Drunk: (Sputtering water) No, but I have to ask you, are you sure that this is where he fell in?");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Posse = (Button) findViewById(R.id.button63);
        Posse.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Posse");
                alertDialog.setMessage("A cowboy and his trusty horse get kidnapped by a group of renegade indians. The chief asks the cowboy if he wants a final wish. The cowboy says yes, that he would like to speak with his horse. They bring him the horse and he whispers in the horses ear, being very emphatic about something, and then the horse takes off down the trail. The indians agree to kill the cowboy at sundown. An hour later, the horse comes back with a very beautiful woman riding on it. The woman goes into the tent, and the cowboy asks to speak with the horse again. Once again, the cowboy whispers into the ear of the horse, seemingly angrily, and the horse weenies and takes off. The cowboy goes into the tent. The horse comes back, right before sundown with another beautiful lady riding on top of it. Just as the indians are to set to burn the cowboy alive, they ask him if he has any last words.\n" +
                        "\n" +
                        "Cowboy: Yes!\n" +
                        "\n" +
                        "The cowboy looks over at his horse and screams:\n" +
                        "\n" +
                        "Cowboy: I SAID POSSE, YOU FUCKING STUPID HORSE, NOT PUSSY!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Ear = (Button) findViewById(R.id.button64);
        Ear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Ear");
                alertDialog.setMessage("Old man walks into a doctors office and up to the receptionists desk.\n" +
                        "\n" +
                        "Receptionist: Hello sir, may I help you?\n" +
                        "Man: Yes, I need to see the doctor.\n" +
                        "Receptionist: Ok sir, what are you wanting to see the doctor for?\n" +
                        "Man: Well, something is wrong with my dick!\n" +
                        "Receptionist: Sir, this is a doctors office with other patients. Please don't use vulgar language.\n" +
                        "Man: Well, my dick isn't working, so I need to see a doctor, what is so hard to understand.\n" +
                        "Receptionist: Nothing sir, but if you are going to need to see the doctor for something personal such as that, you could have just as easily said that you needed to see the doctor for an ear issue and then told the doctor the real reason when you got to the room. The man was perpelexed, so he walked outside, turned around and walked back in and up to the receptionist desk.\n" +
                        "\n" +
                        "Receptionist: Hello again, sir. How may I help you?\n" +
                        "Man: I need to see the doctor.\n" +
                        "Receptionist: And what are you seeing the doctor for today?\n" +
                        "Man: Got a problem with my ear!\n" +
                        "Receptionist: Yes, I see! And what would be the problem you are having with your ear?\n" +
                        "Man: Can't piss out of it!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button SexEd = (Button) findViewById(R.id.button65);
        SexEd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("SexEd");
                alertDialog.setMessage("A very naive woman goes to the doctor to get some medical advice on sex, as she and her boyfriend have had sex, but she didn't understand it.\n" +
                        "\n" +
                        "Woman: What is thing called?\n" +
                        "Doctor: Well, that is called a penis. The main part of the penis is the shaft.\n" +
                        "Woman: Ok, what is the thing at the top of the penis? It has a hole in it!\n" +
                        "Doctor: That is called the head. The hole allows both urine and ejaculate to exit the penis.\n" +
                        "Woman: Ok. Well, what is that thing that hangs down about 14 inches back from the tip of the head?\n" +
                        "Doctor: Lady, I'm not sure about your boyfriend, but on me, that is my asshole!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button SexPill = (Button) findViewById(R.id.button66);
        SexPill.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("SexPill");
                alertDialog.setMessage("A man goes to the doctor with his wife where she complains that he isn't sexual at all any longer. The doctor prescribes the man some pills, but with a warning.\n" +
                        "\n" +
                        "Doctor: Do not allow him to have more than one of these in a 24 hour period. Put my number near the phone! If anything at all seems weird, give me a call! \n" +
                        "\n" +
                        "The woman takes the man home and gives him a pill and they have a wonderful night sex. The next night, howver, the woman gives him two pills thinking that if one was that good, two could only be better. The following morning, the doctor received a call from a little boy. \n" +
                        "\n" +
                        "Boy: This says that if Dad acts weird to call.\n" +
                        "Doctor: Yes, is your father ok?\n" +
                        "Boy: No! Something is wrong.\n" +
                        "Doctor: What is wrong, exactly?\n" +
                        "Boy: Well, Mom is in a coma, grandma is dead, my sister is locked in her room and Dad is walking around the house naked with a boner saying 'here kitty kitty kitty'!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Stress = (Button) findViewById(R.id.button67);
        Stress.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Stress");
                alertDialog.setMessage("A woman and man go to the doctor and have tests run on the man. The doctor asks the man to wait in the lobby while he spoke to his wife.\n" +
                        "\n" +
                        "Doctor: I'm terribly sorry, but your husband is in very bad health. It's stress. If he is to live, he will have to have a completely stress free lifestyle. He needs excersize, so Golf should do fine. Wine, hanging out with friends are also good relaxers, but the most important thing is that he needs to be having sex at least three times a day! If you can keep him stress free, that will keep him alive and healthy for a lot longer!\n" +
                        "\n" +
                        "The woman and the man drive home and when they get home, the woman tells the man to go lay on the couch and relax. She brings him a blanket and a bowl of soup. As the man was eating, he asked what the woman and the doctor spoke about.\n" +
                        "\n" +
                        "Woman: The doctor was saying that you are going to die!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Think = (Button) findViewById(R.id.button68);
        Think.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Think");
                alertDialog.setMessage("Little Johnny sat in class and the teacher asked him:\n" +
                        "\n" +
                        "Teacher: Johnny, if you have four crows on a fence and you shoot one, how many crows do you have left?\n" +
                        "Johnny: None\n" +
                        "Teacher: Explain your answer.\n" +
                        "Johnny: You shoot one, the other fly away!\n" +
                        "Teacher: Wrong answer, but I like the way you think.\n" +
                        "\n" +
                        "Johnny sat brooding about that for a while and finally raised his hand.\n" +
                        "\n" +
                        "Teacher: Yes Johnny?\n" +
                        "Johnny: Can I ask you a question?\n" +
                        "Teacher: Sure!\n" +
                        "Johnny: Three women are sitting in an ice cream parlor eating ice cream. One woman is licking the ice cream, one is sucking it and the third is biting it. Which one of these ladies is married?\n" +
                        "Teacher: The woman who is sucking her ice cream, of course!\n" +
                        "Johnny: No! The one with the wedding ring on, but I like the way you think!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Milk = (Button) findViewById(R.id.button69);
        Milk.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Milk");
                alertDialog.setMessage("A old man sitting on his front porch, minding his own business, was approached by a young man carrying 4 gallon milk jugs.\n" +
                        "\n" +
                        "Young man: Hello sir! I was noticing you have a pond full of milkweed and I was wondering if you wouldn't mind if I were to go and get some milk from those milkweeds?\n" +
                        "Old Man: Son, you are welcome to try, but I have to tell you that you don't get milk from milkweed plants!\n" +
                        "Young Man: If you don't mind, I would like to give it a try. \n" +
                        "\n" +
                        "The young man goes to the pond and after a few hours, he is walking back to the road when he sees the old man sitting on his porch.\n" +
                        "\n" +
                        "Old Man: Did you get yourself some milk?\n" +
                        "Young Man: Yes sir! 4 gallons full!\n" +
                        "\n" +
                        "The young man shows the old man, who asks for a drink.\n" +
                        "\n" +
                        "Old Man: WOW! That is delicious!\n" +
                        "\n" +
                        "A couple of days later, that same young man came back, only this time, he was carrying 2 butter tubs.\n" +
                        "\n" +
                        "Young Man: Sir, last week when I was at your pond, I noticed that you have some buttercups and I was wondering if you would mind if I were to get some butter from them?\n" +
                        "Old Man: Son, you are welcome to try, but I have to tell you that you don't get butter from buttercup plants!\n" +
                        "Young Man: If you don't mind, I would like to give it a try. \n" +
                        "\n" +
                        "The young man goes to the pond and after a few hours, he is walking back to the road when he sees the old man sitting on his porch.\n" +
                        "\n" +
                        "Young Man: Sir, would you like to try the butter I have gotten from the buttercups?\n" +
                        "Old Man: Yes!\n" +
                        "\n" +
                        "The old man tastes the butter and agrees that it is the best butter he has ever used to butter bread in his life!\n" +
                        "\n" +
                        "A couple of days later, that same young man came back. This time he didn't have anything with him. \n" +
                        "\n" +
                        "Young Man: Sir, the other day when I was at the pond, I noticed that you had a bunch of pussy willows...\n" +
                        "Old Man: Hold on, Son! Let me get my hat!\n");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Ducks = (Button) findViewById(R.id.button70);
        Ducks.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Ducks");
                alertDialog.setMessage("Two men, Bob and Bubba were sitting on Bob's front porch.\n" +
                        "\n" +
                        "Bubba: Hey Bob, wanna head down to your pond and shoot us a duck?\n" +
                        "Bob: Ok, but first let's send old blue down there to count how many ducks are on the pond.\n" +
                        "Bubba: Count the ducks? Blue is just a dog and dogs can't count!\n" +
                        "Bob: Hey Blue, why don't you run on down to the pond and count how many ducks there are?\n" +
                        "\n" +
                        "Old Blue runs off down to the pond and in about 10 minutes, he comes back. Blue runs up to Bob and hits his paw against Bob's leg 5 times.\n" +
                        "\n" +
                        "Bob: Old Blue here says there are 5 ducks on that there pond. Grab your gun and we'll go and get us one for dinner.\n" +
                        "Bubba: There ain't no way!\n" +
                        "\n" +
                        "When Bob and Bubba got to the pond, sure enough, there were exactly 5 ducks sitting on that pond. Bubba was amazed.\n" +
                        "\n" +
                        "Bubba: Bob, how much would you take for Old Blue?\n" +
                        "Bob: Old Blue is family. We don't sell family around here and you know it.\n" +
                        "Bubba: I'll give you $500.00 for him.\n" +
                        "Bob: I'll get his crate\n" +
                        "\n" +
                        "Bubba got Old Blue home and told his wife about his good fortune.\n" +
                        "\n" +
                        "Wife: A dog that can count? Bullshit! And to think you bought him for $500.00? You got scammed.\n" +
                        "Bubba: Blue, why don't you head on down to the pond and count how many ducks are down there.\n" +
                        "\n" +
                        "Old Blue runs down to the pond and comes back about 10 minutes later with a stick in his mouth, shaking it furiously.\n" +
                        "\n" +
                        "Wife: Ha! See, that is just a normal old dog!\n" +
                        "Bubba: Blue, how many ducks are on that there pond?\n" +
                        "\n" +
                        "Blue just kept the stick in his mouth shaking it back and forth.\n" +
                        "\n" +
                        "Bubba was stumped, so he gave Bob a call. \n" +
                        "\n" +
                        "Bubba: Hey Bob, I sent Blue down to the pond to count the ducks, but he just come back with a stick in his mouth. Man, this dog can't count!\n" +
                        "Bob: Bubba, you stupid or something? Old Blue there is trying to tell you that there are more ducks on that pond than you can shake a stick at!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button ForSale = (Button) findViewById(R.id.button71);
        ForSale.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("ForSale");
                alertDialog.setMessage("Tony was looking for a dog that he could leave with his wife while he was away from town on his many business trips. As he was driving around, he sees a sign in a persons yard that read \"Talking Dog for Sale\"! Tony walks up to the door and presses the doorbell and the owner comes to the door and tells Tony that the dog is in the backyard. Tony walks to the backyard and there, sitting like a normal dog was a black lab.\n" +
                        "\n" +
                        "Tony: You the talking dog?\n" +
                        "Dog: Yep! \n" +
                        "Tony: Well, what's your story?\n" +
                        "Dog: Well, I discovered I was able to speak when I was just a young pup. Being a very patriotic dog, just like my daddy, I decided to join the CIA and help my gov't out. Soon, they had me going from country to country, sitting in rooms with some of the most powerful men in the world. I was the greatest spy the U.S. ever had. After my run with the CIA, I decided to slow down and take it easy. I was ten years old then and I wasn't getting any younger. I took a job as an undercover police dog, doing nothing sitting near mafia guys and listening in on their conversations. I was part of a secret senate hearing and testified against the mafia and my account brought 100 mafia men to justice. After that, I got married, had a mess of puppies and now I'm retired and looking for my next adventure!\n" +
                        "\n" +
                        "Tony was amazed and told the dog he would be right back. When he got to the front door, the owner was standing there waiting.\n" +
                        "\n" +
                        "Tony: How much do you want for that dog? It's amazing!\n" +
                        "Man: $5.00 and he's yours!\n" +
                        "Tony: Deal...but one question. If that dog is as amazing as it seems, why sell him so cheap.\n" +
                        "Man: Cause, that dog is nothing but a fucking liar. He never did any of that shit!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Truth = (Button) findViewById(R.id.button72);
        Truth.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Truth");
                alertDialog.setMessage("A man and woman were getting ready for their wedding and sat talking about their soon to be new life together. They had decided to wait until marriage to have sex, so neither one had seen the other naked. The woman was worried about something and decided to break the news to the man.\n" +
                        "\n" +
                        "Woman: I want to let you know that I stuff my bra. Upstairs, I am built like a 10year old boy. Nothing!\n" +
                        "Man: I am in love with you for you, and not for your body. I don't care about things like that. If it makes you feel any better, downstairs I am built like a baby.\n" +
                        "\n" +
                        "The woman thinks about this for a minute and then smiles and says that they will work through anything as long as they can do it together. Their wedding day comes and that night, as they are preparing for their first night of intimacy, they see each other nude. Sure enough, when the man undressed the woman, she was very flat chested. Nothing upstairs at all. Then it was the womans turn. She pulled off the mans shirt, and then as she was pulling his pants down, she fainted. The man brings her to, and she starts stuttering and pointing at him.\n" +
                        "\n" +
                        "Woman: You...you said that you were built like a baby downstairs!\n" +
                        "Man: I am, 6 pounds, 181/2 inches!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Pray = (Button) findViewById(R.id.button73);
        Pray.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Pray");
                alertDialog.setMessage("A young man goes to the pharmacy one day to get his first box of condoms. Since he has no experience with them, he asks the pharmacist for help.\n" +
                        "\n" +
                        "Boy: I need a box of condoms. Gonna get lucky tonight and I need some good protection.\n" +
                        "Pharmacist: Well, we got exactly what you need. Do you want a box of 3 or a 12 pack?\n" +
                        "Boy: Better make it a 12 pack. I plan on plowing this chick until the cows come home, know what I mean?\n" +
                        "Pharmacist: Yes indeed! What size did you need there, young man?\n" +
                        "Boy: Better give me the biggest size you got. Got a hog down there, you know? And it's a good thing too, cause I hear this girl gets around.\n" +
                        "Pharmacist: Well, to each their own, I always say. Here ya go! Good luck tonight.\n" +
                        "Boy: Lucks got nothing to do with it.\n" +
                        "\n" +
                        "Later that evening, the boy is over at the girls house sitting with her on the front porch when they are called in for dinner. \n" +
                        "\n" +
                        "Girl: I'm really excited for you to meet my parents. They are going to love you!\n" +
                        "Boy: I'm excited too!\n" +
                        "\n" +
                        "When they got inside and he had met her parents, they sat down and the girls father asked the young man to say the blessing as it is a custom at their dinner table that the new person says it. The boy started praying, asking for fogiveness for each of their sins (especially his own), asking that the food nourish and on and on he went. Finally, when he was finished, the girl leans over to him:\n" +
                        "\n" +
                        "Girl: I didn't know you were so religious!\n" +
                        "Boy: Well, I didn't know your dad was a pharmacist!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button FastLie = (Button) findViewById(R.id.button74);
        FastLie.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("FastLie");
                alertDialog.setMessage("An old man gets pulled over by a state trooper. The trooper approaches the car.\n" +
                        "\n" +
                        "Trooper: Sir, do you know why I pulled you over?\n" +
                        "Man: No sir!\n" +
                        "Trooper: I pulled you over cause you were speeding.\n" +
                        "Man: Oh! I thought it might be because this car is stolen.\n" +
                        "Trooper: What's that now?\n" +
                        "Man: Yes sir, this car is stolen. I also have a large caliber handgun in the glove compartment and the dead body of a man in my trunk.\n" +
                        "Trooper: Sir, you just sit tight!\n" +
                        "\n" +
                        "The trooper goes back to his car and requests backup and a lieutenant to get on the scene. When the lieutenant arrived, the trooper filled him in on what was going on. The lieutenant decided to go have a talk with this man.\n" +
                        "\n" +
                        "Lieutenant: Sir, my trooper back here tells me that you have a large caliber handgun in the glove compartment. Is that true?\n" +
                        "Man: No sir! Nothing in there but my cars paperwork. Look for yourself.\n" +
                        "\n" +
                        "The Lieutenant looks in the glove compartment and can see no gun. \n" +
                        "\n" +
                        "Lieutenant: Sir, he also states that you said there was a dead body in the trunk? Do you mind popping the trunk and allowing us to see?\n" +
                        "Man: Not at all. As you will see, there is no dead body in there. \n" +
                        "\n" +
                        "The Lieutenant looked in the empty trunk and then came back up to the car. \n" +
                        "\n" +
                        "Lieutenant: Sir, my trooper also said that this car was stolen, but they have just informed me that this car is registered to you and only you. \n" +
                        "Man: Well, that beats all I have ever seen. I bet that sonofabitch also told you I was speeding, didn't he?");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Dallas = (Button) findViewById(R.id.button75);
        Dallas.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Dallas");
                alertDialog.setMessage("An old married couple are driving down the road when they get pulled over. \n" +
                        "\n" +
                        "Police: Sir, I pulled you over for speeding. Can I see your license, please?\n" +
                        "Man: No sir.\n" +
                        "Woman: (Yelling) WHAT DID HE SAY?\n" +
                        "Man: HE SAID HE PULLED ME OVER FOR SPEEDING!\n" +
                        "\n" +
                        "The trooper looks at his license.\n" +
                        "\n" +
                        "Police: Sir, I am also going to need your proof of insurance.\n" +
                        "Woman: WHAT DID HE SAY?\n" +
                        "Man: HE SAID HE NEEDS PROOF OF INSURANCE!\n" +
                        "\n" +
                        "The man hands the cop the information and the cops studies it. After a second, he looks at the man.\n" +
                        "\n" +
                        "Police: It says here that you are from Dallas, Tx?\n" +
                        "Man: Yes sir. Born and raised.\n" +
                        "Police: The worst pussy I have ever gotten was in Dallas, Tx!\n" +
                        "Woman: WHAT DID HE SAY?\n" +
                        "Man: HE SAID HE THINKS HE KNOWS YOU!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Fine = (Button) findViewById(R.id.button76);
        Fine.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Fine");
                alertDialog.setMessage("A farmer got into an accident with a tractor trailer and decided to take them to court. The lawyer for the defense started to cross examine the farmer:\n" +
                        "\n" +
                        "Lawyer: Sir, did you not tell the first state trooper on the scene that you were fine and uninjured.\n" +
                        "Farmer: Well, it started like this. I was loading Bessie, my mule, up in the back of the truck..\n" +
                        "Lawyer: A simple yes or no will do, sir!\n" +
                        "Farmer: Right, as I was saying, so there I was driving down the road with Bessie in the back. Just as I...\n" +
                        "Lawyer: Sir, just answer the question, did you or did you not tell the first responder that your were fine? Yes or no? Your honor, please instruct the client to answer only the questions posed and to not elaborate.\n" +
                        "\n" +
                        "The Judge was interested in the farmers story and told the man to proceed with his story.\n" +
                        "\n" +
                        "Man: Just as I was entering into the four way, a truck blew past the stop sign and tboned me. I was thrown from the vehicle. My leg was broken and I couldn't move. I could hear old Bessie across the road, moaning something terrible. The trooper walked over to Bessie and pulled his gun and shot her dead. Then he walked over to me, still holding his gun:\n" +
                        "\n" +
                        "Trooper: Sir, your mules leg was broken, so I killed her. How are you doing?");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Red = (Button) findViewById(R.id.button77);
        Red.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Red");
                alertDialog.setMessage("Two old women are driving along in their town. As they are driving, Hazel looks up and can see that they just ran a red light. She thinks to herself that she should say something to Mildred, but can't be completely sure that she didn't imagine the whole thing. Shortly after, they ran another red light, but once again, Hazel doesn't say anything to Mildred as she is unsure of herself. At the next light, however, they blow through another light and she can't keep it in any longer.\n" +
                        "\n" +
                        "Hazel: Mildred, honey, you know we just blew through three red lights, right?\n" +
                        "Mildred: Yes! I noticed that as well!\n" +
                        "Hazel: Well, don't you think you should stop at the red lights instead of running through them and risking killing us both?\n" +
                        "Mildred: Hazel, you're the one driving!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button ReMind = (Button) findViewById(R.id.button78);
        ReMind.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("ReMind");
                alertDialog.setMessage("Two old ladies sitting around a card table after finishing a game of bridge. One old lady looks at the other:\n" +
                        "\n" +
                        "Lady1: Sweety, I know I have known you all my life, but I have been trying to figure out your name for the last hour and I cannot seem to remember it. Can you please forgive an old, forgetful friend and remind me what your name is?\n" +
                        "Lady2: Well, I'll be!\n" +
                        "\n" +
                        "Lady2 sat there in angry silence for about 5 minutes, her face glowing red and the look of disappointment on her face. Lady1 was starting to think she had really upset her friend when she finally spoke:\n" +
                        "\n" +
                        "Lady1: When do you need to know by?");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Memory = (Button) findViewById(R.id.button79);
        Memory.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Memory");
                alertDialog.setMessage("A man was jogging through the park one day when he noticed an old man sitting on a park bench crying his eyes out. Having been depressed before, he decides to speak with the old man.\n" +
                        "\n" +
                        "Jogger: Sir, are you ok?\n" +
                        "Man: I have a 25 year old wife at home that wakes me every morning with breakfast in bed and lovemaking to start the day!\n" +
                        "Jogger: Sounds awesome. Why are you so sad?\n" +
                        "Man: Every day for lunch, she makes me my favorite lunch and then makes passionate love to me all afternoon. \n" +
                        "Jogger: I'm not seeing the problem here!\n" +
                        "Man: For dinner, she gets dressed up in her little black dresses, takes me to fine establishments to eat, and then takes me home and makes gentle love to me all night long.\n" +
                        "Jogger: Sir, these seem to be great things. Why the hell are you sitting in the park, alone, crying?\n" +
                        "\n" +
                        "The man starts bawling anew:\n" +
                        "\n" +
                        "Man: I forgot where I live!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button ToldYou = (Button) findViewById(R.id.button80);
        ToldYou.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("ToldYou");
                alertDialog.setMessage("An old couple were pulled over by a police officer for running a stop sign.\n" +
                        "\n" +
                        "Officer: Sir, you just ran straight through that stop sign, I'm going to have to see your license and registration.\n" +
                        "Woman: SEE THERE? I TOLD YOU THAT THERE WAS A STOP SIGN!\n" +
                        "Man: WOMAN, shut the fuck up! I'm busy here!\n" +
                        "Officer: Sir, this license is expired. \n" +
                        "Woman: SEE THERE? I TOLD YOU LAST MONTH THAT YOU NEEDED TO RENEW YOUR LICENSE!\n" +
                        "Man: WOMAN, shut the fuck up, grown men are talking!\n" +
                        "Officer: Ma'am, does your husband often speak to you in such harsh tones?\n" +
                        "Woman: No! Only when he's as drunk as he is now!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Scared = (Button) findViewById(R.id.button81);
        Scared.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Scared");
                alertDialog.setMessage("A man gets pulled over by a state trooper for doing 30mph over the speed limit. As he was feeling good and it was the last day before the weekend, he decided to be a good sport about the whole matter.\n" +
                        "\n" +
                        "Officer: Sir, I clocked you going 90mph in a 60mph zone. If you can give me one good reason why, I won't arrest you and take you to jail today!\n" +
                        "Man: Well sir, it goes like this. My wife recently left me. I was heartbroken, so to ease my pain, I went and bought a whole new wardrobe. I felt like a new man, but I was still driving around in that old mini-van. So, I went and bought myself my dream car, this corvette, cause I always wanted one. After getting the car, I met a beautiful young woman that takes incredible care for me. I'm as happy as I have ever been in whole life!\n" +
                        "Officer: That doesn't explain why you were speeding.\n" +
                        "Man: Well, the man my wife left me for was a state trooper and I thought you were trying to bring that bitch back to me!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Focus = (Button) findViewById(R.id.button82);
        Focus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Focus");
                alertDialog.setMessage("Two women, Mawd and Ethel, were getting interviewed for their 101st birthday. Ethel was almost deaf, but Mawd could hear just fine.\n" +
                        "\n" +
                        "\n" +
                        "The photographer asked them to sit on the sofa.\n" +
                        "\n" +
                        "Ethel: WHAT DID HE SAY?\n" +
                        "Mawd: WE GOTTA SIT OVER THERE ON THE SOFA!\n" +
                        "Photographer: Now get a little closer together.\n" +
                        "Ethel: WHAT DID HE SAY? \n" +
                        "Mawd: HE SAYS SQUEEZE TOGETHER A LITTLE.\n" +
                        "Photographer: Just hold still for a bit longer, I've got to focus a little\n" +
                        "Ethel: WHAT DID HE SAY?\n" +
                        "Mawd: HE SAYS HE'S GONNA FOCUS! \n" +
                        "Ethel: (Smiling) OH MY GOD - BOTH OF US?");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Married = (Button) findViewById(R.id.button83);
        Married.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Married");
                alertDialog.setMessage("Satan walks into a church and starts to spew hellfire. Everyone runs and shouts except for one man sitting in the back pew. Satan looks at the man, and makes bats manifest before him. Still, the man just sits there, looking unimpressed. Finally, Satan gets upset.\n" +
                        "\n" +
                        "Satan: You should fear me! I can kill you with just the blink of my eyes!\n" +
                        "Man: Shit, what makes you think I would be afraid of you when I have been living with your sister for the last 20 years?");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button LawSuit = (Button) findViewById(R.id.button84);
        LawSuit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("LawSuit");
                alertDialog.setMessage("One day, the angels in Heaven wake up and find that heaven is about 100 yards smaller, as the fence that divided heaven and hell was moved. The grass on the hell side was burned and the grass on the heaven side was plush and green. The fence now sat on fresh green grass, 100 yards further into heaven than just the night previous. The angels decide to call Jesus.\n" +
                        "\n" +
                        "Jesus: Ok Satan, move the fence back to where it was. Don't be a dick!\n" +
                        "Satan: I'm sorry, Jesus, but we have not moved the fence.\n" +
                        "Jesus: I can see that it has been moved. I mean, just look at the grass. It's obvious.\n" +
                        "Satan: Once again, I cannot recall us ever moving the fence.\n" +
                        "Jesus: Well, guess I am just going to have to sue you over this!\n" +
                        "Satan: Yeah? With what lawyer?");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Corn = (Button) findViewById(R.id.button85);
        Corn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Corn");
                alertDialog.setMessage("An old man and woman are sitting out on their porch when the old woman looks at the old man:\n" +
                        "\n" +
                        "Woman: Honey, we have been married for 60years. I want to die knowing everything about you. Tell me, did you ever have an affair on me?\n" +
                        "Man: Yes dear. When I was very young. I got drunk at an office party, and ended up sleeping with my secretary. I was wrought with guilt and it only happened that one time.\n" +
                        "Woman: Well, just know that I forgive you now, but I have known all along!\n" +
                        "Man: That makes me feel a ton better, my dear. So much better. Tell me, did you ever have an affair on me?\n" +
                        "\n" +
                        "The old woman looked at the old man and then went inside. When she returned, she had a small cardboard box with 3 ears of corn and a duffelbag. \n" +
                        "\n" +
                        "Man: What is this?\n" +
                        "Woman: Well, like I said, I knew you had an affair on me, so I decided to get you back. For each ear of corn you see, that is how many times I had an affair to get revenge.\n" +
                        "Man: Well, I only see three ears here. So, you only had 3 affairs in revenge? What's in the duffelbag?\n" +
                        "Woman: Well, when I got a bushel, I sold them!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Sense = (Button) findViewById(R.id.button86);
        Sense.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Sense");
                alertDialog.setMessage("Two ignorant brothers, Fred and Al, stood at the bottom of a grave they were digging for the prisoner that had died the day before. It was a sweltering hot day outside, and the boss was sitting up under a shade tree, hat down over his sunglassed eyes, drinking himself some cool lemonade!\n" +
                        "\n" +
                        "Fred: You know, I wonder it is us two that is digging this here hole and not that lazy bastard up there what's getting actually paid to be here.\n" +
                        "Al: I know what you mean! This just ain't right. I want some of that damned lemonade, too!\n" +
                        "Fred: I'm going to go ask him.\n" +
                        "Al: Hell yeah!\n" +
                        "\n" +
                        "Fred jumps out of the hole and walks up to the prison guard.\n" +
                        "\n" +
                        "Fred: Sir, we were just wondering why it is that you sit here underneath this tree relaxing, drinking some delicious looking lemonade, while we two are out in the hot sun digging a grave.\n" +
                        "Guard: Well son, that's just common sense!\n" +
                        "Fred: Common what?\n" +
                        "Guard: Common Sense! Here let me show you.\n" +
                        "\n" +
                        "The guard stands up and puts his hand directly in front of the tree. \n" +
                        "\n" +
                        "Guard: Now, I want you to hit my hand as hard as you can!\n" +
                        "Fred: No sir! I don't want to get into any more trouble. I was just being curious!\n" +
                        "Guard: Fred, you won't get into any trouble, and what's more, when you see what I am about to show you, you will be smarter than your brother by a mile!\n" +
                        "\n" +
                        "Fred couldn't stop thinking about that last part and he hauled off and took the mightiest swing at the guards hand that he could. Right before he hits the guards hand, the guard moves it and Fred punches the hell out of the tree, busting his hand to pieces. \n" +
                        "\n" +
                        "Guard: Now, there son! That's common sense. Do you understand now?\n" +
                        "Fred: Yes sir, I think I do!\n" +
                        "Guard: Good, now you go on over there and finish with that grave so we can make it back in time for supper!\n" +
                        "\n" +
                        "Fred went to the hole, but simply sat down beside it.\n" +
                        "\n" +
                        "Al: Well, what the hell did you find out?\n" +
                        "Fred: I found out that the reason we are digging and he ain't is simply because of common sense.\n" +
                        "Al: What's that?\n" +
                        "Fred: I ain't supposed to show you because it means that I'm smarter than you now, but since you's my brother and all, I suppose I could show it to you.\n" +
                        "\n" +
                        "Fred jumps down into the hole and holds his hand up in front of his face.\n" +
                        "\n" +
                        "Fred: Now, I want you to hit my hand as hard as you absolutely can!\n" +
                        "\n");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Angel = (Button) findViewById(R.id.button87);
        Angel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Angel");
                alertDialog.setMessage("Two babies die and go to heaven. A black baby and a white baby. The white baby looks at himself and then to God.\n" +
                        "\n" +
                        "White Baby: God, am I am angel?\n" +
                        "God: Yes you are, my child! Spread your wings and fly, fly free here in heaven where your every wish comes true and nothing bad can happen to you. Fly!\n" +
                        "\n" +
                        "The black baby looks himself over as well. \n" +
                        "\n" +
                        "Black Baby: God, am I also an angel, free to fly around heaven and enjoy the many spendid things?\n" +
                        "God: Naw kid, you a bat!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Caddy = (Button) findViewById(R.id.button88);
        Caddy.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Caddy");
                alertDialog.setMessage("This guy dies and goes to heaven. When he gets there, he is told that in order to get into heaven, you will be judged according to how faithful you were to your spouse. Then, depending on how faithful you were, you will get assigned a car. The more faithful, the better the car. The man walks up to St. Peter and St. Peter asks what happened to land him in Heaven.\n" +
                        "\n" +
                        "Man: Well, we were on vacation and got hit by a Tsunami.\n" +
                        "St. Peter: Ok. Who is we?\n" +
                        "Man: My wife and myself. I stayed alive in the hospital for a month after she died in the Tsunami, but I'm here now and ready to see her again. \n" +
                        "\n" +
                        "At this time, two other men came along. St. Peter introduced them to the man and explained that they would be his handlers while he was getting comfortable and learning his way around. He was awarded a Solid Gold Cadillac, because in life he was very faithful to his wife, whom he was still madly in love with. Once he got into heaven, he bid his handlers goodbye and drove off. A couple days later, they came upon him again, sitting beside his car on the curb, crying his eyes out.\n" +
                        "\n" +
                        "Handler: Hey buddy, what seems to be the matter?\n" +
                        "Man: I looked and I looked and I just couldn't find my wife. My fear was that she had been somehow bad and had gone to hell.\n" +
                        "Handler: Hell is a myth. We just award transportation in heaven as a means to tell who was a faithful spouse and who was unfaithful.\n" +
                        "Man: I know that now! I finally found my wife. I was sitting at a stop light, and she came skateboarding across the intersection.");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Kegel = (Button) findViewById(R.id.button89);
        Kegel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Kegel");
                alertDialog.setMessage("A woman stood over a mirror performing Kegel excercises. Her husband walked into the room and looked at her.\n" +
                        "\n" +
                        "Husband: What on earth are you doing?\n" +
                        "Woman: I'm doing my kegel excersises so that my pussy will stay tight for you!\n" +
                        "\n" +
                        "The husband just shakes his head, but then points at the mirror:\n" +
                        "\n" +
                        "Husband: Well...ok, but watch out for that giant hole in the floor! ");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Told = (Button) findViewById(R.id.button90);
        Told.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Told");
                alertDialog.setMessage("What do you tell a woman with two black eyes?\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Nothing! You've done told that bitch twice!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Cold = (Button) findViewById(R.id.button91);
        Cold.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Cold");
                alertDialog.setMessage("A guy invites his new girlfriend and her mother over to his house for dinner. The girl is happy and says that her mother is very interested in meeting his talking parrot and talking about Jesus. The guy suddenly remembers telling the girl that he owned a parrot and that he was a christian and he panics. He drives to the local pet store and enters right before it closes.\n" +
                        "\n" +
                        "Man: I need a parrot\n" +
                        "Owner: I only got one, but it has a very bad cursing problem.\n" +
                        "Man: Doesn't matter, I have to have one before tonight.\n" +
                        "\n" +
                        "The man buys the parrot and brings it home. Upon entering the house, the bird starts to speak.\n" +
                        "\n" +
                        "Bird: This place is a shithole\n" +
                        "Man: Watch your mouth. We are going to have some very important company tonight and her mothers a very strong christian.\n" +
                        "Bird: Not my fucking problem, man!\n" +
                        "Man: If you curse one more time, you are going in for a time out.\n" +
                        "Bird: Fuck you!\n" +
                        "\n" +
                        "The man grabs the bird and puts it in the freezer and closes the door. He is about to get the bird out, when his doorbell rang. The girlfriend and her mother were early. He answers the door and after some polite conversation, the mother asks to see the bird. Realizing that he had left the bird in the freezer, he runs and opens the freezer, pulling the shivering bird out. The mother grabs the bird and holds it tight against her. \n" +
                        "\n" +
                        "Woman: You fiend. How could you do that to an innocent bird?\n" +
                        "Bird: You...you think what he did to me is bad? You should see what he did to that fucking chicken in the freezer!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Blind = (Button) findViewById(R.id.button92);
        Blind.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Blind");
                alertDialog.setMessage("A group of golfers were on the course taking forever to finish with the first hole. Another group of golfers was waiting to tee up and were getting frustrated.\n" +
                        "\n" +
                        "Man1: What is the fucking deal with those golfers? It took them 15 minutes just to tee off, and now they're sitting down there just screwing around.\n" +
                        "Man2: Those are the blind firefighters that went blind saving those children from that burning building last year.\n" +
                        "\n" +
                        "Man1 puts his golf ball on the tee and swings. The ball sails through the air and almost hits one of the blind golfers.\n" +
                        "\n" +
                        "Man2: Hey, you almost hit those blind golfers.\n" +
                        "Man1: Fuckem! They should have played last night!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Rename = (Button) findViewById(R.id.button93);
        Rename.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Rename");
                alertDialog.setMessage("A little boy sat in his first day of class as role call was being performed. When the teacher got to him, she asked what his name was.\n" +
                        "\n" +
                        "Boy: My name is Asshole!\n" +
                        "Teacher: NO! You will not use that word in my classroom. What is your real name.\n" +
                        "Boy: I done told you! My name is Asshole!\n" +
                        "Teacher: I'm going to ask you one more time what your name is, and if you don't answer, you can just go home until you can tell me honestly.\n" +
                        "Boy: I told you twice, my name is Asshole.\n" +
                        "Teacher: Get out! And don't come back until you can tell me your real name. \n" +
                        "\n" +
                        "The boy got up and started to walk out of the classroom. All the kids were laughing. At the door, he stopped and looked back at his brother, who was sitting at the back of the class.\n" +
                        "\n" +
                        "Boy: Come on, Shitforbrains, she ain't gonna believe you either!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Baptist = (Button) findViewById(R.id.button94);
        Baptist.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Baptist");
                alertDialog.setMessage("A man dies and goes to heaven. An angel agrees to give the man a tour of heaven.\n" +
                        "\n" +
                        "Angel: On your right, you will see the Buddhists. They keep to themselves, but they know how to throw a wild party. \n" +
                        "\n" +
                        "The Buddhists were talking noisily to each other in a very social environment. It was a celebration that would never end.\n" +
                        "\n" +
                        "Angel: On your left, you will see the Mormons. They keep to themselves, but they are very family oriented and are very friendly.\n" +
                        "\n" +
                        "The Mormons were sitting around a large table, drinking hot chocolate and reading aloud from a book. They were very friendly.\n" +
                        "\n" +
                        "Angel: Now, when we get up to the end of this hallway, you will need to be very, very quiet.\n" +
                        "\n" +
                        "When they got to the end of the hallway, the man could see a group of people sitting in what looked like a church. They were looking around with paranoid suspicion. \n" +
                        "\n" +
                        "Man: Who are these people?\n" +
                        "Angel: These are the baptists. They believe that they are the only ones up here!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button One = (Button) findViewById(R.id.button95);
        One.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("One");
                alertDialog.setMessage("David and his wife Sonia went to David's daddy's farm for the first time since they were newly married. To show her the whole farm, David hooked the mule up to the carriage and they got on it and started to tour the grounds. About a mile out into a field, the mule stopped and refused to move any further. David got off the cart and walked up the the mule.\n" +
                        "\n" +
                        "David: Ok Mule, that's 1\n" +
                        "\n" +
                        "When David said this, he held up one finger. Sonia had never seen this before, but decided that she didn't understand farm life and kept her mouth shut. Another mile out into the fields, the mule stopped again. David dismounted and walked up to the mule.\n" +
                        "\n" +
                        "David: Ok Mule, that's 2!\n" +
                        "\n" +
                        "When he said this, he held up two fingers for the Mule to see. Still not sure what was going on, Sonia kept her mouth shut. Just as they were about to turn around and head home, the mule stopped again. David dismounted, pulled his 45 from his hip and shot the mule between the eyes. David then crawls back up and sits beside Sonia.\n" +
                        "\n" +
                        "Sonia: What the hell, David? We're two miles out on your Daddy's land and no way to get back without that jackass and now you've done gone and killed it? Are you stupid or something?\n" +
                        "David: Ok bitch, that's 1!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });

        Button Quiet = (Button) findViewById(R.id.button96);
        Quiet.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Quiet");
                alertDialog.setMessage("A man walks into the police station where the burglar that broke into his house the night before was being held.\n" +
                        "\n" +
                        "Man: I want to speak with the man who was arrested for breaking into my house and stealing my stuff\n" +
                        "Officer: Well, you'll just have to wait until his court date and you will have your opportunity to speak with him.\n" +
                        "Man: No, you don't understand. I need to know how the man broke into my house without waking up my wife. I've been trying to do that for years with no luck!");

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });


        Button Last = (Button) findViewById(R.id.button97);
        Last.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Last");
                alertDialog.setMessage("Here is a story for you from my own personal life. I have performed many jobs, from maintenance worker, to business owner, but now, obviously, I work in Tech and I am writing this app for my own personal enjoyment. This story takes place back in 2000. I had owned a carpet cleaning business, but I wouldn't allow my men to work if it was pouring rain (good for business normally, but with all the red mud of the area, it was better to just reschedule). I tell you this because on the day that this happened, my business partner and myself were driving home in the pouring rain. On the way home, we saw a man walking away from his broken down car. Since it was pouring, we decided to stop and ask the guy if he needed a ride somewhere. This was us normally, always doing good things for people. We weren't crooks or con men! The guy got into the front seat as my coworker got into the back of the car. The guy had a bag with him and he was soaked to the bone. He thanked us profusely and told us where we could drop him off. It wasn't far out of our way, and we told him we would be happy to take him home. I noticed that the guy kept his hand on his bag, almost as if he were afraid that we were going to try and steal it from him. When I noticed this, I thought I would ease his mind and make some small talk:\n" +
                                "\n" +
                                "Me: Hey man, you can relax! We aren't thiefs or anything!\n" +
                                "Man: It's cool, man! I'm just a little pensive, is all!\n" +
                                "Me: Well, what you got in the bag that makes you so nervous?\n" +
                                "Man: None of your fucking business!\n" +
                                "\n" +
                                "Well, that escalated quickly. Not trying to piss off someone I just met and make an enemy of them, I decided to leave the situation alone, however, my coworker was a former street kid who refused to allow that to just pass:\n" +
                                "\n" +
                                "Friend: Hey man, if there is anything illegal in that bag, just tell us now so we can let you out and be on our way.\n" +
                                "Man: Don't worry about it!\n" +
                                "Friend: Well, what's in the bag then?\n" +
                                "Man: None of your fucking business, that's what!\n" +
                                "\n" +
                                "I motioned for my coworker to leave it alone and he reluctantly agreed. The man looked at me and smiled, a warm, apologetic smile. \n" +
                                "\n" +
                                "Man: Sorry for being so vague, but I have just been through a lot lately.\n" +
                                "Me: Well, yeah, I can imagine. Your car breaks down, two guys give you a ride, but hassle you about your personal belongings. I get it!\n" +
                                "Man: Oh! That wasn't my car! I was walking home from work.\n" +
                                "\n" +
                                "This struck me as odd as it had been raining all day long, and when we picked him up, he was in the middle of nowhere! I decided that the best thing to do was to get this strange man to his house, and to leave it at that. To go home, crank up the xbox and use the rest of my day off for relaxing. When we pulled up into the guys driveway, we could see a red car parked near his garage. This made the man highly aggitated. We parked and he got out of the car and ducked his head back inside. \n" +
                                "\n" +
                                "Man: Hey, listen, if you guys wait here for just 5 minutes, I will give each of you $200.00. I may need a ride after this. \n" +
                                "Me: What for?\n" +
                                "Man: I may not be able to stay here, I'm not sure. But if not, I have a place to go just up the road.\n" +
                                "Me: Fine man, but we aren't waiting out here for long.\n" +
                                "\n" +
                                "The man agreed and took off running for the house. My coworker got back into the front seat and moved the mans bag to the back seat. Suddenly, there were gun shots from inside the house. My coworker and myself were not wasting any time in getting away from that place and took the hell off. We got back to my house, grabbed the guys bag and went inside. We watched the news, checked the local news sites, but we never found anything that suggested a shooting took place at that guys house. To this day, it is still a mystery to both of us and we laugh whenever we talk about it!\n" +
                                "\n" +
                                "\n" +
                                "I want to thank you for reading these jokes. Note that if you were offended by any of the jokes, these came from the world and are being put back out into the world. I don't endorse any religion, race, sexual orientation etc because I honestly just don't give a shit about all that. My only goal here was to make you laugh. If I failed at that, then the only thing I can say is fuckem if they can't take a joke"
                );

                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                alertDialog.show();
            }
        });
    }

    public void onClickButtonListener() {
        Memes = (Button)findViewById(R.id.button99);
        Memes.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intentMain2Activity = new Intent(MainActivity.this, Main2Activity.class);
                        startActivity(intentMain2Activity);
                    }
                }
        );

    }
    public void process(View view) {
        Intent intent = null, chooser = null;

        if (view.getId() == R.id.button98) {
            intent = new Intent(Intent.ACTION_SEND);
            intent.setData(Uri.parse("mailto:"));
            String[] to = {"idontdogoodartwerk@gmail.com"};
            intent.putExtra(Intent.EXTRA_EMAIL, to);
            intent.putExtra(Intent.EXTRA_SUBJECT, "Got a joke for ya!");
            intent.putExtra(Intent.EXTRA_TEXT, "Please shoot me an email!");
            intent.setType("message/rfc822");
            chooser = Intent.createChooser(intent, "Send Email");
            startActivity(chooser);
        }

    }
}




