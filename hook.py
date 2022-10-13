# Made by mars
from discord import SyncWebhook
import discord
# replace webhook for whatever channel you want
print("Made by Mars")
print("")
print("Checking Webhook Link...")
print("")
try:
    webhook = SyncWebhook.from_url("PUT WEBHOOK URL HERE")
except:
    print("Invalid Webhook URL")
    exit()
print("Webhook Link Valid!")
print("")
# files should be named like this: "1.png", "2.png", "3.png", "4.png", etc
# ONLY NUMBERS
# ONLY .PNG FILES
# EVERYTHING WILL BREAK IF YOU DON'T FOLLOW
def send_image(id):
    try:
        file = discord.File(id+".png", filename=id+".png")
    except:
        print("The file: "+id+".png was not found, please check your filenames and your range")
        exit()
    #change the letters and numbers after the "0x" to change the color
    embed = discord.Embed(title="ID: "+id, color=0xFE865E)
    embed.set_image(url="attachment://"+id+".png")
    webhook.send(file=file, embed=embed, )
# first number: starting id
# second number: ending id but add 1
# ex: For sending ids 1-9, you would set the range to 6,10
print("Starting to send images...")
print("")
for i in range(6,10):
    send_image(str(i))
print("All done!")