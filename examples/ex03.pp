#% Spaceship operator in use
#% Catalog:
#% {
#%   "type": "File",
#% 	 "title": "file",
#% 	 "parameters": {
#% 		 "owner": "bob",
#% 		 "group": "the group"
#% 	 }
#% }

node default {
	file { 'file': owner => "alice" }
	File <| title == 'file' |> {
		owner => 'bob',
		group => 'the group',
	} 
}