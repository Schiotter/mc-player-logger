# Minecraft Player Logger Plugin
Easy Minecraft Server Plugin (Bukkit) to Log the Player Join and Quit

---

nothing special, just wanted to know on my private server who was going online and offline and when. Basically, the plugin saves the following values each time a player logs in or logs out. The Format is basic text, but its comma separated, so you could open it with Excel, LibreOffice, etc if you safe it as *.csv.

* Date & Time
* Playername
* Player ID (UUID)
* World
* Position (X,Y,Z)
* Remote Address (only on Join)

An example Line of a Player joining could Look like this:

```
2021/03/23 21:08:11,Join,SchlotterMC,4a0fe3b5-fa1a-4c5c-9cd7-4d0c20092150,world,-62,65,34,/10.0.0.255:64569
```

#### Get it

```bash
git clone https://github.com/schiotter/mc-player-logger.git
```
after that, you only need to compile the Code with Bukkit 1.16.5 as Referenced Libary. Or add it to your own Projects :D
