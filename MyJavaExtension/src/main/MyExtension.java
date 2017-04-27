/**
 * 
 */
package main;

import com.smartfoxserver.v2.core.SFSEventType;
import com.smartfoxserver.v2.extensions.SFSExtension;

import sfsEventHandler.BuddyListInitEventHandler;
import sfsEventHandler.BuddyAddEventHandler;
import sfsEventHandler.BuddyBlockEventHandler;
import sfsEventHandler.BuddyMessageEventHandler;
import sfsEventHandler.BuddyOnlineStateUpdate;
import sfsEventHandler.BuddyRemoveEventHandler;
import sfsEventHandler.BuddyVariablesUpdateEventHandler;
import sfsEventHandler.FileUploadEventHandler;
import sfsEventHandler.GameInvitationFailureEventHandler;
import sfsEventHandler.GameInvitationSuccessEventHandler;
import sfsEventHandler.PlayerToSpectatorEventHandler;
import sfsEventHandler.PrivateMessageEventHandler;
import sfsEventHandler.PublicMessageEventHandler;
import sfsEventHandler.RoomAddedEventHandler;
import sfsEventHandler.RoomRemovedEventHandler;
import sfsEventHandler.RoomVariablesUpdateEventHandler;
import sfsEventHandler.ServerReadyEventHandler;
import sfsEventHandler.SpectatorToPlayerEventHandler;
import sfsEventHandler.UserDisconnectEventHandler;
import sfsEventHandler.UserJoinRoomEventHandler;
import sfsEventHandler.UserJoinZoneEventHandler;
import sfsEventHandler.UserLeaveRoomEventHandler;
import sfsEventHandler.UserLoginEventHandler;
import sfsEventHandler.UserLogoutEventHandler;
import sfsEventHandler.UserReconnectionSuccessEventHandler;
import sfsEventHandler.UserReconnectionTryEventHandler;
import sfsEventHandler.UserVariablesUpdateEventHandler;
import requestHandler.UserMsgRequestHandler;




/**
 * @author UX303
 *
 */
public class MyExtension extends SFSExtension
{
	/**
	 *  {@inheritDoc}  
	 */
	public void init()
	{
		//TODO Auto-generated method stub
		trace("!!FUCK!!");
		
		
		
		this.addEventHandler(SFSEventType.BUDDY_ADD, BuddyAddEventHandler.class);
		this.addEventHandler(SFSEventType.BUDDY_BLOCK, BuddyBlockEventHandler.class);
		this.addEventHandler(SFSEventType.BUDDY_LIST_INIT, BuddyListInitEventHandler.class);
		this.addEventHandler(SFSEventType.BUDDY_MESSAGE, BuddyMessageEventHandler.class);
		this.addEventHandler(SFSEventType.BUDDY_ONLINE_STATE_UPDATE, BuddyOnlineStateUpdate.class);
		this.addEventHandler(SFSEventType.BUDDY_REMOVE, BuddyRemoveEventHandler.class);
		this.addEventHandler(SFSEventType.BUDDY_VARIABLES_UPDATE, BuddyVariablesUpdateEventHandler.class);
		
		this.addEventHandler(SFSEventType.FILE_UPLOAD, FileUploadEventHandler.class);
		
		this.addEventHandler(SFSEventType.GAME_INVITATION_FAILURE, GameInvitationFailureEventHandler.class);
		this.addEventHandler(SFSEventType.GAME_INVITATION_SUCCESS, GameInvitationSuccessEventHandler.class);
		
		this.addEventHandler(SFSEventType.PLAYER_TO_SPECTATOR, PlayerToSpectatorEventHandler.class);
		
		this.addEventHandler(SFSEventType.PRIVATE_MESSAGE, PrivateMessageEventHandler.class);
		this.addEventHandler(SFSEventType.PUBLIC_MESSAGE, PublicMessageEventHandler.class);
		
		this.addEventHandler(SFSEventType.ROOM_ADDED, RoomAddedEventHandler.class);
		this.addEventHandler(SFSEventType.ROOM_REMOVED, RoomRemovedEventHandler.class);
		this.addEventHandler(SFSEventType.ROOM_VARIABLES_UPDATE, RoomVariablesUpdateEventHandler.class);
		
		this.addEventHandler(SFSEventType.SERVER_READY, ServerReadyEventHandler.class);
		this.addEventHandler(SFSEventType.SPECTATOR_TO_PLAYER, SpectatorToPlayerEventHandler.class);
		
		this.addEventHandler(SFSEventType.USER_DISCONNECT, UserDisconnectEventHandler.class);
		this.addEventHandler(SFSEventType.USER_JOIN_ROOM, UserJoinRoomEventHandler.class);
		this.addEventHandler(SFSEventType.USER_JOIN_ZONE, UserJoinZoneEventHandler.class);
		this.addEventHandler(SFSEventType.USER_LEAVE_ROOM, UserLeaveRoomEventHandler.class);	
		this.addEventHandler(SFSEventType.USER_LOGIN, UserLoginEventHandler.class);
		this.addEventHandler(SFSEventType.USER_LOGOUT, UserLogoutEventHandler.class);
		this.addEventHandler(SFSEventType.USER_RECONNECTION_SUCCESS, UserReconnectionSuccessEventHandler.class);
		this.addEventHandler(SFSEventType.USER_RECONNECTION_TRY, UserReconnectionTryEventHandler.class);
		this.addEventHandler(SFSEventType.USER_VARIABLES_UPDATE, UserVariablesUpdateEventHandler.class);

		
		
		
		
		
		
		
		this.addRequestHandler("UserMsg", UserMsgRequestHandler.class);
		
		
		
	}
	
	/**
	 *  {@inheritDoc}
	 */
	public void destroy()
	{
		//TODO Auto-generated method stub
		super.destroy();
	}
}
