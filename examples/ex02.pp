#% Adding to a resource
#% Catalog:
#% {
#%   "type": "User",
#%   "title": "alice",
#%   "parameters": {
#%     "password": 12345,
#%     "comment": "comment"
#%   }
#% }

node default {
	user { 'alice': password => 12345 }

	User ['alice'] {comment => "comment"}
}