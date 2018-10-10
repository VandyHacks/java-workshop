#!/usr/bin/env bash
MISSION_ID="duobattle"
BATTLE_SEED=27
echo "import $MISSION_ID.*;
import $MISSION_ID.Main;" >MISSION_HEADER
cat MISSION_HEADER RawDavyJonesLocker.java > DavyJonesLocker.java
javac -cp ".:lib/*" DavyJonesLocker.java 2>>DEBUG
java -cp ".:lib/*" DavyJonesLocker "$BATTLE_SEED" >>DEBUG 2>&1
curl --data "@results.json" https://mimirbattleships.glitch.me/data --header "Content-Type: application/json" >DEBUG
