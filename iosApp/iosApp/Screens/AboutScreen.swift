//
//  AboutScreen.swift
//  iosApp
//
//  Created by Bilal-PC on 21.05.2026.
//

import SwiftUI

struct AboutScreen: View {
    var body: some View {
      NavigationStack {
        AboutListView()
          .navigationTitle("About Device")
      }
    }
}

#Preview {
    AboutScreen()
}
