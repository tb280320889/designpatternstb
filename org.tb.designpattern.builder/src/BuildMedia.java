import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**        IntelliJ IDEA
 *	Created by TangBin
 *	Date : 14-9-7
 *	Time : 下午1:07
 */

class Media extends ArrayList<Object> { }
	class Book extends Media { }
	class Magazine extends Media { }
	class WebSite extends Media { }

	class MediaItem {
		private String s;
		public MediaItem() { }
		public MediaItem(String s) { this.s = s; }
		@Override
		public String toString() { return s; }
	}

	class Chapter extends MediaItem { public Chapter(String s) { super(s); } }
	class Article extends MediaItem { public Article(String s) { super(s); } }
	class WebItem extends MediaItem { public WebItem(String s) { super(s); } }

	class MediaBuilder {
		public void buildCase() { }
		public void addMediaItem(MediaItem item) { }
		public Media getFinishedMedia() { return null; }
	}

	class BookBuilder extends MediaBuilder {
		private Book b;
		@Override
		public void buildCase() {
			System.out.println("Building book framework");
			b = new Book();
		}
		@Override
		public void addMediaItem(MediaItem chapter) {
			final String s = "Adding chapter " + chapter;
			System.out.println(s);
			b.add(chapter);
		}
		@Override
		public Media getFinishedMedia() { return b; }
	}
	class MagazineBuilder extends MediaBuilder {
		private Magazine m;
		@Override
		public void buildCase() {
			System.out.println("Building magazine framework");
			m = new Magazine();
		}

		@Override
		public void addMediaItem(MediaItem article) {
			System.out.println("Adding article " + article);
			m.add(article);
		}
		@Override
		public Media getFinishedMedia() { return m; } }
	class WebSiteBuilder extends MagazineBuilder {
		private WebSite w;
		@Override
		public void buildCase() {
			System.out.println("Building web site framework");
			w = new WebSite();
		}

		@Override
		public void addMediaItem(MediaItem webItem) {
			System.out.println("Adding web site " + webItem);
			w.add(webItem);
		}
		@Override
		public Media getFinishedMedia() { return w; }
	}
	class MediaDirector {
		private MediaBuilder mediaBuilder;
		public MediaDirector(MediaBuilder mediaBuilder) { this.mediaBuilder = mediaBuilder; }

		public Media produceMedia(List<MediaItem> input) {
			mediaBuilder.buildCase();
			for (MediaItem anInput : input) {
				mediaBuilder.addMediaItem(anInput);
			}
			return mediaBuilder.getFinishedMedia();
		}
	}

public class BuildMedia extends TestCase {
	public static void main(String[] args) {
		junit.textui.TestRunner.run(BuildMedia.class);
	}
		private List<MediaItem> input = Arrays.asList(new MediaItem("item1"), new MediaItem("item2"), new MediaItem("item3"), new MediaItem("item4"));

		public void testBook() {
			MediaDirector buildBook = new MediaDirector(new BookBuilder());
			Media book = buildBook.produceMedia(input);
			final String result = "book: " + book;
			System.out.println(result);
			assertEquals(result, "book: [item1, item2, item3, item4]");
		}

		public void testMagazine() {
			MediaDirector buildMagazine = new MediaDirector(new MagazineBuilder());
			Media magazine = buildMagazine.produceMedia(input);
			final String result = "magazine: " + magazine;
			System.out.println(result);
			assertEquals(result, "magazine: [item1, item2, item3, item4]");
		}

		public void testWebSite() {
			MediaDirector buildWebSite = new MediaDirector(new WebSiteBuilder());
			Media webSite = buildWebSite.produceMedia(input);
			final String result = "web site: " + webSite;
			System.out.println(result);
			assertEquals(result, "web site: [item1, item2, item3, item4]");
		}
	}
