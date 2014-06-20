package com.phunware.jenkinsandroidapp.test;

import com.phunware.jenkinsandroidapp.MainActivity;
import com.robotium.solo.Solo;

import android.test.ActivityInstrumentationTestCase2;

public class MainActivityTest extends
		ActivityInstrumentationTestCase2<MainActivity> {
	private Solo mSolo;

	public MainActivityTest() {
		super(MainActivity.class);
	}

	protected void setUp() throws Exception {
		mSolo = new Solo(getInstrumentation(), getActivity());
		super.setUp();
	}

	@Override
	protected void tearDown() throws Exception {

		mSolo.finishOpenedActivities();
		super.tearDown();
	}

	public void testSanityFail() {
		mSolo.assertCurrentActivity("In main activity", MainActivity.class);
		fail("Fail fail fail");
	}
	
	public void testSanityPass() {
		mSolo.assertCurrentActivity("In main activity", MainActivity.class);
		assertTrue(true);
	}
}
