#!/usr/bin/env bash
MISSION_ID="duobattle"
BATTLE_SEED=42
echo 0 > OUTPUT
#mkdir "$MISSION_ID"
#mv ./duobattle/Main.java "$MISSION_ID"
#mv ./duobattle/redteam "$MISSION_ID"
#mv ./duobattle/blueteam "$MISSION_ID"
#git clone https://github.com/MimirHQ/battleship.git
git clone https://github.com/MimirHQ/battleshipvizlib.git
mv battleshipvizlib/lib lib
mv battleshipvizlib/RawDavyJonesLocker.java RawDavyJonesLocker.java
rm -rf battleshipvizlib
echo "import $MISSION_ID.*;
import $MISSION_ID.Main;" >MISSION_HEADER
cat MISSION_HEADER RawDavyJonesLocker.java > DavyJonesLocker.java
javac -cp ".:lib/*" DavyJonesLocker.java 2>>DEBUG
java -cp ".:lib/*" DavyJonesLocker "$BATTLE_SEED" >>DEBUG 2>&1
curl --data "@results.json" https://mimirbattleships.glitch.me/data --header "Content-Type: application/json" >DEBUG