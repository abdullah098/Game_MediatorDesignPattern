# Game_MediatorDesignPattern

# FA17-BSE-030
# ABDULLAH IQBAL

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Your are developing an game called Dungeons & Dragons (D&D). The game has three players: a Barbarian Viking, an Old Wizzard and a Rogue Warrior, each has an initial strength of 20. The following table shows the moves of one player and the response of other players. Note that the strength of the responding player reduces with each action.
Move	Response	Stength Reduction (responding players only)
Draw sword	Use shield	2
Find gold	Fight for your share	6
Caste a spell	See in estonishment	7

At the start of the game, all three players walk into the game. Every player does his move and the stength of others is effected. If a player has less that 10 strength left, he says that I am about to die.
Following is an example game play:
Old Wizard [20] walks in the Dungeons & Dragons
Rogue Warrior [20] walks in the Dungeons & Dragons
Barbarian Viking [20] walks in the Dungeons & Dragons
++++++++++++++++++++++
Old Wizard [20] casted a spell
Rogue Warrior [13] sees in astonishment
Barbarian Viking [13] sees in astonishment
++++++++++++++++++++++
Rogue Warrior [13] draws his sword
Old Wizard [18] use his shield
Barbarian Viking [11] use his shield
++++++++++++++++++++++
Barbarian Viking [11] found gold
Old Wizard [12] fights for his share of the gold
Rogue Warrior [7] fights for his share of the gold
Rogue Warrior [7] is about to die
Implement the D&D game using the design patterns you have learnt. Test it for the above game play.
