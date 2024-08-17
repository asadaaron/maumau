# MauMau Game
This is a sample mau mau game. Three players can participate in this game (one human, second one may be human or computer and the third one is a computer.)

## Transition Diagram
![state transition diagram](https://github.com/user-attachments/assets/75780308-37d2-410a-a043-cf132cdfb281)

## Class Diagram
![class diagram](https://github.com/user-attachments/assets/7c0342ed-4a3a-49e9-b08e-6222c64c716f)


## User interface output
* Name of the current player
* Top card in the discard pile
* Cards remaining for the others player
* Notification if a player chooses a invalid card
* Information of the current player played card
* Name of the player who has won in that round
* Notification of the special card handling event. i.e: when played 7, next player draws 2 cards

## Computer Player Strategy
### Play the highest-ranked card that matches
* It is helpful to play higher-ranked cards when the game is scored based on the remaining cards values. It will help to reduce the sum of the remaining cards. 
### Prioritize Playing Special Cards
* Having special cards, provide extra facility to the player. So if the computer has any special cards, it should prioritize these. i.e Skip the next player's turn, giving the computer another chance to play.

### Balance between different suits and ranks
* The computer should play in a manner so that it has a different blend of suits and ranks cards. This ensure that it is less likely to get stuck with an unplayable hand in future turn.
### Reduce number of cards in hand without compromising the ability to play 
* It should aim to reduce the number of cards as soon as possible, without compromising the ability to play in the next round. 
### Play immidiately after draw if possible
* It reduces the number of cards in hand and prevents the player from being penalized for having to draw
